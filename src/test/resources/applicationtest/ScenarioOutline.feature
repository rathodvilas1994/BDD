Feature: Login feature with different invalide combinations
Scenario Outline: Login with different combinations
Given user is at the application login screen
When user enters "<username>" in username field
And user enters "<password>" in password field
And click on the signin button
Then user should get error message

Examples:
|username | password |
| incorrectusername | correctpassword |
|correctusername | incorrectpassword |
| incorrectusername | incorrectpassword | 