Feature: Login to Amazon application

Scenario: Registered user Login
Given User visit to Amazon page
When I entered user name as "admin"
And entered password as "admin"
And click on Login button
Then user should be navigate to welcome page


Feature: Amazon Search Products

Scenario: Search a Product
Given I have a searcg field on Amazon page
When I search for a product with name "Bose Soundbar" and price is "90000"
Then Product with name "Bose Soundbar" should be displayed

