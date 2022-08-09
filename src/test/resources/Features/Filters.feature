Feature: to verify the filters functionality of flipkart

  Background: 
    User is on the flipkart page


  Scenario: user should be able to filter results using all parameters on the page.
    Given user must have searched for the product in the search box
    And user should be on products list
    When user applies an filter on the page
    Then flipkart should return only those products which satisfies that particular filter
