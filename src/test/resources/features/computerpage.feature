Feature: Computer Page

  @smoke @regression
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on home page
    When Click on Computer tab
    Then Verify Computer text

  @sanity @regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on home page
    When Click on Computer tab
    And Click on Desktops link
    Then Verify Desktops text

  @regression
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on home page
    When Click on Computer tab
    And Click on Desktops link
    And I Click on product name Build your own computer
    And I Select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on ADD TO CART Button
    Then Verify message The product has been added to your shopping cart

  Examples:
  | processor                                       | ram           | hdd               | os                       | software                   |
  | 2.2 GHz Intel Pentium Dual-Core E2200           | 3             | 320 GB            | Vista Home [+$50.00]     | Microsoft Office [+$50.00] |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4             | 400 GB [+$100.00] | Vista Premium [+$60.00]  | Acrobat Reader [+$10.00]   |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 5             | 320 GB            | Vista  Home [+$50.00]    | Total Commander [+$5.00]   |
