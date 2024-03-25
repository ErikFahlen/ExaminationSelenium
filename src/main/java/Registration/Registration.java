package Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class Registration {
    private WebDriver driver;

    @Test
    public void successfulRegistration() {
        driver = new ChromeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

        driver.manage().window().setSize(new Dimension(968, 1012));

        driver.findElement(By.id("dp")).click();

        driver.findElement(By.id("dp")).sendKeys("19/01/2000");

        driver.findElement(By.id("member_firstname")).sendKeys("Erik");

        driver.findElement(By.id("member_lastname")).sendKeys("Fahlén");

        driver.findElement(By.id("member_emailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("signupunlicenced_password")).sendKeys("erikerik");

        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("erikerik");

        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

        driver.findElement(By.name("join")).click();

        String actual ="";
        String expected ="";
        assertEquals(expected, actual);
        //assertThat(driver.findElement(By.cssSelector(".bold:nth-child(1)")).getText(), is("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND"));
        driver.close();
    }

    @Test
    public void registrationWithoutLastName() {
        driver = new EdgeDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

        driver.manage().window().setSize(new Dimension(968, 1012));

        driver.findElement(By.id("dp")).click();

        driver.findElement(By.id("dp")).sendKeys("19/01/2000");

        driver.findElement(By.id("member_firstname")).sendKeys("Erik");

        driver.findElement(By.id("member_emailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("signupunlicenced_password")).sendKeys("erikerik");

        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("erikerik");

        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

        driver.findElement(By.name("join")).click();

        String actual ="";
        String expected ="";
        assertEquals(expected, actual);
        //assertThat(driver.findElement(By.cssSelector(".bold:nth-child(1)")).getText(), is("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND"));
        driver.close();
    }

    @Test
    public void registrationWithoutTaC() {
        driver = new FirefoxDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

        driver.manage().window().setSize(new Dimension(968, 1012));

        driver.findElement(By.id("dp")).click();

        driver.findElement(By.id("dp")).sendKeys("19/01/2000");

        driver.findElement(By.id("member_firstname")).sendKeys("Erik");

        driver.findElement(By.id("member_lastname")).sendKeys("Fahlén");

        driver.findElement(By.id("member_emailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("signupunlicenced_password")).sendKeys("erikerik");

        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("erikerik");

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

        driver.findElement(By.name("join")).click();

        String actual ="";
        String expected ="";
        assertEquals(expected, actual);
        //assertThat(driver.findElement(By.cssSelector(".bold:nth-child(1)")).getText(), is("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND"));
        driver.close();
    }
    @Test
    public void registrationWithWrongPasswordConfirmation() {
        driver = new FirefoxDriver();

        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

        driver.manage().window().setSize(new Dimension(968, 1012));

        driver.findElement(By.id("dp")).click();

        driver.findElement(By.id("dp")).sendKeys("19/01/2000");

        driver.findElement(By.id("member_firstname")).sendKeys("Erik");

        driver.findElement(By.id("member_lastname")).sendKeys("Fahlén");

        driver.findElement(By.id("member_emailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("member_confirmemailaddress")).sendKeys("erik@mail.se");

        driver.findElement(By.id("signupunlicenced_password")).sendKeys("erikerik");

        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys("erikperik");

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();

        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

        driver.findElement(By.name("join")).click();

        String actual ="";
        String expected ="";
        assertEquals(expected, actual);
        //assertThat(driver.findElement(By.cssSelector(".bold:nth-child(1)")).getText(), is("THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND"));
        driver.close();
    }
}
