Feature: Insert searched item on Amazon whish list

  Scenario: Search for a macbook Air, insert the correct user login, and add the item successfully to the wish list
    Given I am on the Amazon homepage
    And I click in the "Sign In" button
    And I enter "youremail@provider.com" into the field "Email"
    And I enter "yourpw" into the field "Password"
    And I click in the "Sign In" button	
    And I click in the "Search In" button selecting the "Computers" Category
    And I enter "macBook Air" in the search box
    And I click in the "Search" button
    And I click in the image of the first result in the search list result page
    And I click in the button "Add to List" in the item page
    And I click in the button "View Your List" in the "Add to List" page
    Then My wish list, should be populated with the item macBook Air