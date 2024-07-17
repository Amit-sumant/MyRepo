Feature: Amazon Search

Scenario: Search a Product

Given I have search a field on page
When I search for a product with name "Orders"
And Click on Enter
Then Product with name "Orders" should be displayed

