Feature: profile functionality

@sanity @functional
Scenario: Add profile feature
Given user is at the add profile page
When user enters the information
Then profile gets created

@functional @regression
Scenario: Edit profile
Given user is at profile page
When user click on edit link
And update the information
Then profile gets updated

@regression
Scenario: Delete profile
Given user is at profile page
When user click on delete button
Then profile should  gets deleted