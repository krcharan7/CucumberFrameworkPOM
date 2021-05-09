Feature: Application Login

Scenario: user chcecks for rediff page
Given user sets up the browser and navigate to url "https://www.rediff.com/"
And user clicks on signIn button
When user enters user name as "krcharan" and password as "pasword@12" 
And clicks on LogIn button
Then user clicks on rediff link
And searched items in rediff page 
And navigates to child window and search with firstcompany name 