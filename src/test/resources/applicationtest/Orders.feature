Feature: Order informations
Background:
Given User should be logged into the application
When User click on order button
Then User should redirect to the order page

Scenario: Validate the currently placed order
When User click on the order
Then User should track the package

Scenario: Validate information for previously place order
When User click on past order button
Then User should see the information
