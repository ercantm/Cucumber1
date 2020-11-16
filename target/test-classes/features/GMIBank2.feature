Feature: MGI Bank Login into account
Existing user shold able to login to account using correct credentials
 

@SmokeTest
Scenario: login into the account with correct credentials

Given user naviage  MGI Bank homa page botton
And user click  icon and sign in buttom
And user enter the valid username and password
When Home p user clicks sign in button
Then user info successfully display

