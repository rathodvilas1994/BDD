Feature: Login
Scenario: login page title
Given user is at landing page 
When user gets the title of page
Then page title should contains "Shopping"

Scenario: verify cart icon 
Given  user is at landing page 
Then cart icon should get display

Scenario: Login to application
Given user is at landing page
When user enters username as "9049904405"
And user enters password as "123456"
And user confirms signin