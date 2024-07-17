Feature: Login Page Fearure

Scenario: Initial Page Title
Given user is on demp page
When user gets title of the page
Then page title should be "nopCommerce demo store"

Scenario: Login with valid credentials
Given user is on demo page
When user click on "Log in" link
Then sign in page should be displayed
And page title shoudl be "nopCommerce demo store. Login"
When user enters Email "as7130068@gmail.com"
And user enters Password "Admin123"
And user click on Login button
Then user gets the title of the page
And page title should be "nopCommerce demo store"

