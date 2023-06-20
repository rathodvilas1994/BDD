Feature: Login functionality with data
Scenario: Validate login for given data
Given User should be at the login screen
When User enters the username as "testuser"
And User enter the password as "test@12345"
And User click on 1 Login button 
Then User should get logged in