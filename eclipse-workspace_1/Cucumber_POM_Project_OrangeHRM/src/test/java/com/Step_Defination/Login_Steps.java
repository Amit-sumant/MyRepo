package com.Step_Defination;

import org.junit.Assert;

import com.Pages.LoginPage;
import com.qa.Factory.Driver_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps 
{
	private LoginPage logpage=new LoginPage(Driver_Factory.getDriver());
	
	
	@Given("User is on Login page")
	public void user_is_on_login_page1() 
	{
	   String title = logpage.getLoginPageTitle();
	   System.out.println("Login Page title is ->  " + title);
	   Assert.assertTrue(title.contains(""));
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Login Page title should be {string}")
	public void login_page_title_should_be(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on Login button")
	public void user_click_on_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user gets the title of the Home page")
	public void user_gets_the_title_of_the_home_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
