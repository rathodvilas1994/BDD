Feature: Registration
Scenario: user information resistration
Given user should be at registration page 
When user enters the following information 
|Erin | Smith | erin.smith@cucumber.com | 9988776655 |
|Cesar | Sanchez | cesar.sanchez@cucumber.com | 9988776656 |
|Diana | Martin | diana.martin@cucumber.com | 9988776657 |
Then user should see the app id
