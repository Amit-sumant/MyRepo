package stepDefination;

import org.junit.Assert;

import com.java.pages.Login_Page;
import com.qa.Factory.Driver_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage
{
	private Login_Page logpage=new Login_Page(Driver_Factory.getDriver());

	@Given("user is on demp page")
	public void user_is_on_demp_page() 
	{
		Driver_Factory.getDriver().get("https://demo.nopcommerce.com/");
	    
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page(String mainPageTitle) 
	{
		String demoStr = logpage.init_pageTitle();
	    System.out.println("Your Initial Page Title is - " + demoStr);
	    Assert.assertTrue(demoStr.contains(mainPageTitle));
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	//2nd TC
	@Given("user is on demo page")
	public void user_is_on_demo_page() 
	{
	    logpage.userOnDempPage();
	    
	    
	}

	@When("user click on {string} link")
	public void user_click_on_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("sign in page should be displayed")
	public void sign_in_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user enters Email {string}")
	public void user_enters_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user enters Password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
