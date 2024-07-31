package stepDefination;

import org.junit.Assert;

import com.java.pages.Login_Page;
import com.qa.Factory.Driver_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage
{
	private static String demoStr;
	
	private Login_Page logpage=new Login_Page(Driver_Factory.getDriver());

	@Given("^user is on demo page$")
	public void user_is_on_demo_page1() 
	{
		Driver_Factory.getDriver().get("https://demo.nopcommerce.com/");
	    
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() 
	{
		demoStr = logpage.init_pageTitle();
	    System.out.println("Your Initial Page Title is - " + demoStr);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		Assert.assertTrue(demoStr.contains(expectedTitle));
	    
	}

	//2nd TC
	@Given("user is on nopCommerce demo page")
	public void user_is_on_nopCommerce_demo_page() 
	{
	    logpage.init_pageTitle();
	}

	@When("user click on {string} link")
	public void user_click_on_link(String string) 
	{
	    logpage.clickLoginLink_Initialpage();
	    
	}

	@Then("sign in page should be displayed")
	public void sign_in_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user enters Email {string}")
	public void user_enters_email(String username) 
	{
	    
	    logpage.enterUserName(username);
	}

	@When("user enters Password {string}")
	public void user_enters_password(String password) 
	{
	    logpage.enterPassword(password);
	   
	}

	@When("user click on Login button")
	public void user_click_on_login_button() 
	{
	    logpage.clickOnLogin();
	    
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() 
	{
	    
	    logpage.userOnDemoPage();
	}
	
}
