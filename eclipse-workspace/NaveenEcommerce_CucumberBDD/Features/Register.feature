Feature: Register User

Scenario: Successful Register User Page
	Given User Launch Chrome Browser
	When User opens the URL "https://naveenautomationlabs.com/opencart/"
	And User navigates to the Home page and clicks on "My Account" and click on "Register"
	Then Page Title should be "Register Account"
	When User enters First Name as "Amit" and Last Name as "Sumant" and E-Mail as "as@gmail.com" and Telephone as "987542135" and Password as "admin" and Confirm Password as "admin"
	And User selects the privacy policy checkbox
	And Click on Continue
	Then Page Title should be "Your Account Has Been Created!"
	When User clicks on the Continue button
	Then Page Title should be "Returning Customer"
	And Close Browser