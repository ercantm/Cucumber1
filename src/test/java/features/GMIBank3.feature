Feature: MGI Bank Login before login  account using cancel button 
Existing user before login to account using cancel botton 
 

@SmokeTest
Scenario: login into the account with correct credentials

Given user naviage  MGI Bank homa page botton
And user click  icon and sign in buttom
And user enter the valid username and password
When user clicks cancel button
Then user info will not  display

