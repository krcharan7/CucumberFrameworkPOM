Feature: Application Login

Scenario: Home page default login

Given user logs into page with username "jinnu" and password "krkrk"
When user is on netBanking login page
And user selects option as credit cards
Then all the saved cards are populated  

Scenario: Home page negitive login

Given user logs into page with username "Munnu" and password "raja123"
When user is on netBanking login page
And user selects option as credit cards
Then all the saved cards are populated  