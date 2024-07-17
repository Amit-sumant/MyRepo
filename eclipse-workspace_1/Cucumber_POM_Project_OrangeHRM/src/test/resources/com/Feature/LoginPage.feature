Feature: Login Page feature

Scenario: Login Page Title
Given User is on Login page1
When User gets the title of the page
Then Login Page title should be "OrangeHRM"

Scenario: Forgot Password Link
Given User is on Login page
Then Forgot your password link should be displayed

Scenario: Login with valid credentials
Given User is on Login Page
When user enters username "Admin"
And user enters password "admin123"
And user click on Login button
Then user gets the title of the Home page
And Home page title should be "OrangeHRM"