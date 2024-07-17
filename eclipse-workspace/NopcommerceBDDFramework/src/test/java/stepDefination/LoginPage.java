package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage 
{
	
	@Given("^user is login page")
	public void user_is_login_page()
	{
	    System.out.println("Step 1");

	}

	@When("^title of login page is nopcommerce")
	public void title_of_login_page_is_nopcommerce()
	{
		System.out.println("Step 2");
	    
	}

	@Then("^user enter username and password")
	public void user_enter_username_and_password()
	{
		System.out.println("Step 3");
	    
	}

	@Then("^user click on login button")
	public void user_click_on_login_button() 
	{
		System.out.println("Step 4");
	   
	}

	@Then("^user is on home page")
	public void user_is_on_home_page() 
	{
		System.out.println("Step 5");
	    
	}

	
}
