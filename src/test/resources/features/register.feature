Feature: Register Functionality

  @smoke @regression
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on home page
    When Click on Register Link
    Then Verify Register text

  @sanity @regression
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on home page
    When Click on Register Link
    And Click on REGISTER button
    And Verify the error message First name is required.
    And Verify the error message Last name is required.
    And Verify the error message Email is required.
    And Verify the error message Password is required.
    Then Verify the error message confirm Password is required.

  @regression
  Scenario: verifyThatUserShouldCreateAccountSuccessfully
    Given I am on home page
    When Click on Register Link
    And I Select gender Female
    And I Enter firstname "Tom"
    And I Enter lastname "Patel"
    And I Select day
    And I Select month
    And I Select year
    And I Enter email "lkjh@gmail.com"
    And I Enter password "lkj@123"
    And I Enter Confirm Password "lkj@123"
    And Click on REGISTER button
    Then Verify message Your registration completed
