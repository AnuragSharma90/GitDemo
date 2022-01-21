Feature: Search and place order for vegetables
@SeleniumTest
Scenario: Search for items and validate results
Given User on the Greenkart Landing Page
When User searched for "Cucumber" Vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and move out to checkout page
Given User on the Greenkart Landing Page
When User searched for "Brinjal" Vegetable
And User added items to Kart
Then verify selected "Brinjal" items are displayed in Checkout page



