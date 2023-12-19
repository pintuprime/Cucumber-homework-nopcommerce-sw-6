Feature: LoginPage

  @smoke @regression
  Scenario: userShouldNavigateToLoginPageSuccessFully.
    Given I am on home page
    When Click on login link
    Then verify that Welcome Please Sign In  message display

  @sanity @regression
  Scenario: verifyTheErrorMessageWithInValidCredentials.
    Given I am on home page
    When Click on login link
    And Enter EmailId "zxc@gmail.com"
    And Enter Password "zxc@123"
    And Click on Login Button
    Then Verify that the Error message

  @regression
  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
    Given I am on home page
    When Click on login link
    And Enter EmailId "mmnn@gmail.com"
    And Enter Password "mmnn@123"
    And Click on Login Button
    Then Verify that LogOut link is display


  Scenario: VerifyThatUserShouldLogOutSuccessFully
    Given I am on home page
    When Click on login link
    And Enter EmailId "mmnn@gmail.com"
    And Enter Password "mmnn@123"
    And Click on Login Button
    And Click on LogOut Link
    Then Verify that LogIn Link Display
