Feature: To verify the search box functionality of flipkart

  Scenario: User enters the product name to be searched into the search box of flipkart
    Given user is logged in successfully into flipkart
    When user types the product name into the search box
    And clicks on enter button
    Then user is directed to the results page

  Scenario: user should be able to filter results using all parameters on the page.
    Given user must have searched for the product in the search box
    And user should be on products list
    When user applies an filter on the page
    Then flipkart should return only those products which satisfies that particular filter
