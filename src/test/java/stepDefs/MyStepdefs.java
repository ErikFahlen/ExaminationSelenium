package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class MyStepdefs {


    private WebDriver driver;
    private String randomEmail;

    private void click(WebDriver driver, By by) {

        (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(by));

        driver.findElement(by).click();
    }



    @Given("I have navigated to webpage with {string}")
    public void iHaveNavigatedToWebpage(String browser) {
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        }
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @Given("I have entered date of birth {string}")
    public void iHaveEnteredDateOfBirth(String dateOfBirth) {
        driver.findElement(By.id("dp")).sendKeys(dateOfBirth);
    }

    @Given("I have entered a first name {string}")
    public void iHaveEnteredAFirstName(String firstName) {
        driver.findElement(By.id("member_firstname")).sendKeys(firstName);

    }

    @Given("I have entered a last name {string}")
    public void iHaveEnteredALastName(String lastName) {
        driver.findElement(By.id("member_lastname")).sendKeys(lastName);
    }

    @Given("I have entered a emailaddress {string}")
    public void iHaveEnteredAEmailaddress(String arg0) {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        randomEmail = randomNumber+"erik@mail.com";
        driver.findElement(By.id("member_emailaddress")).sendKeys(randomEmail);
    }

    @Given("I have entered the same emailaddress again {string}")
    public void iHaveEnteredTheSameEmailaddressAgain(String arg0) {
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(randomEmail);
    }

    @Given("I have entered a password {string}")
    public void iHaveEnteredAPassword(String password) {
        driver.findElement(By.id("signupunlicenced_password")).sendKeys(password);
    }


    @Given("I have entered the same password again {string}")
    public void iHaveEnteredTheSamePasswordAgain(String confirmPassword) {
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys(confirmPassword);

    }


    @Given("I click on ToC {string}")
    public void iClickOnToC(String termsAndConditions) {
        if (termsAndConditions.equals("Checked")){
            driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();
        }

    }

    @Given("I click on am over {int}")
    public void iAmOver(int arg0) {
        click(driver, By.cssSelector(".md-checkbox:nth-child(2) > label > .box"));
    }

    @Given("I click on Code of Ethics")
    public void iClickOnCodeOfEthics() {
        click(driver, By.cssSelector(".md-checkbox:nth-child(7) .box"));
    }

    @When("I click on register")
    public void iClickOnRegister() {
        driver.findElement(By.name("join")).click();
    }

    @Then("Verify {string} on page")
    public void verifyOnPage(String expected) {
        if (expected.equals("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND")) {
            WebElement text = driver.findElement(By.xpath("/html/body/div/div[2]/div/h2"));
            String actual = text.getText();

            assertEquals(expected, actual);
        } else if (expected.equals("Last Name is required")) {
            WebElement text = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[2]/div/span/span"));
            String actual = text.getText();

            assertEquals(expected, actual);
        } else if (expected.equals("Password did not match")) {
            WebElement text = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[8]/div/div[2]/div[2]/div/span/span"));
            String actual = text.getText();

            assertEquals(expected, actual);
        } else if (expected.equals("You must confirm that you have read and accepted our Terms and Conditions")) {
            WebElement text = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[1]/span/span"));
            String actual = text.getText();

            assertEquals(expected, actual);
        }

        driver.close();
    }


}
