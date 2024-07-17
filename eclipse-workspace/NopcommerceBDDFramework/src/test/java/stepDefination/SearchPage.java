package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPage 
{
	@Given("^I have search a field on page$")
	public void i_have_search_a_field_on_page()
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I search for a product with name \"([^\"]*)\"$")
	public void i_search_for_a_product_with_name(String arg1)
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Click on Enter$")
	public void click_on_Enter()
	{
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Product with name \"([^\"]*)\" should be displayed$")
	public void product_with_name_should_be_displayed(String arg1)
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
