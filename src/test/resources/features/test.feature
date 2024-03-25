Feature:

  Scenario Outline: Registration on website
    Given I have navigated to webpage with "<browser>"
    Given I have entered date of birth "<dateOfBirth>"
    Given I have entered a first name "<firstName>"
    Given I have entered a last name "<lastName>"
    Given I have entered a emailaddress "<emailAddress>"
    Given I have entered the same emailaddress again "<confirmEmailAddress>"
    Given I have entered a password "<password>"
    Given I have entered the same password again "<confirmPassword>"
    Given I click on ToC "<termsAndConditions>"
    Given I click on am over 18
    Given I click on Code of Ethics
    When I click on register
    Then Verify "<confirmationText>" on page

    Examples:
      | browser | dateOfBirth | firstName | lastName | emailAddress | confirmEmailAddress | password | confirmPassword | termsAndConditions | confirmationText                                                          |  |
      | Chrome  | 19/01/2000  | Erik      | Fahlén   | randomEmail  | randomEmail         | erikerik | erikerik        | Checked            | THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND                 |  |
      | Edge    | 19/02/2000  | Erkman    | Fahlén   | randomEmail  | randomEmail         | erikerik | erikk123        | Checked            | Password did not match                                                    |  |
      | Chrome  | 19/01/2000  | Erik      |          | randomEmail  | randomEmail         | erikerik | erikerik        | Checked            | Last Name is required                                                     |  |
      | Edge    | 19/01/2000  | Erik      | Fahlén   | randomEmail  | randomEmail         | erikerik | erikerik        |                    | You must confirm that you have read and accepted our Terms and Conditions |  |


 # Scenario: Successful registration
  #  Given I have navigated to webpage with "Chrome"
   # Given I have entered date of birth "19/01/2000"
  #  Given I have entered a first name "Erik"
  #  Given I have entered a last name "Fahlén"
   # Given I have entered a emailaddress "erik@mail.com"
   # Given I have entered the same emailaddress again "erik@mail.com"
  #  Given I have entered a password "erik123"
  #  Given I have entered the same password again "erik123"
  #  Given I click on ToC
   # Given I am over 18
   # Given I click on Code of Ethics
  #  When I click on register
   # Then Verify "THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND" on page

  #Scenario: Register without accepting TaC
  # Given I have navigated to webpage with "Chrome"
  #  Given I have entered date of birth "19/01/2000"
  #  Given I have entered a first name "Erik"
  #  Given I have entered a last name "Fahlén"
  #  Given I have entered a emailaddress "erik@mail.com"
  #  Given I have entered the same emailaddress again "erik@mail.com"
  #  Given I have entered a password "erik123"
  #  Given I have entered the same password again "erik123"
  #  Given I am over 18
  #  Given I click on Code of Ethics
  #  When I click on register
  #  Then Verify "You must confirm that you have read and accepted our Terms and Conditions" on page

#  Scenario: Register with passwords not matching
 #   Given I have navigated to webpage with "Chrome"
 #   Given I have entered date of birth "19/01/2000"
 #   Given I have entered a first name "Erik"
#    Given I have entered a last name "Fahlén"
#    Given I have entered a emailaddress "erik@mail.com"
#    Given I have entered the same emailaddress again "erik@mail.com"
#    Given I have entered a password "erik123"
#    Given I have entered the wrong confirmation password "erik12"
#   Given I click on ToC
 #   Given I am over 18
#    Given I click on Code of Ethics
#    When I click on register
#    Then Verify "Password did not match" on page

 # Scenario: Register with last name missing
  #  Given I have navigated to webpage with "Chrome"
   # Given I have entered date of birth "19/01/2000"
  #  Given I have entered a first name "Erik"
  #  Given I have entered a emailaddress "erik@mail.com"
    #Given I have entered the same emailaddress again "erik@mail.com"
  #  Given I have entered a password "erik123"
  #  Given I have entered the same password again "erik123"
  #  Given I click on ToC
  #  Given I am over 18
  #  Given I click on Code of Ethics
  #  When I click on register
  #  Then Verify "Last Name is required" on page