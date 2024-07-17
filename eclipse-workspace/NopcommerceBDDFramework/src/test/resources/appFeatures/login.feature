Feature: Login page of nopcommerce application

Scenario: Successful login to nopCommerce application

Given user is login page
When title of login page is nopcommerce
Then user enter username and password
Then user click on login button
And user is on home page