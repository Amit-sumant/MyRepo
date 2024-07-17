package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel_NaveenEcommerce.RegisterUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepRegistration
{
	public WebDriver driver;
	public RegisterUser rgstr;
	
	@Given("^User Launch Chrome Driver$")
	public void user_Launch_Chrome_Driver() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		rgstr = new RegisterUser(driver); 
	}

	@When("^User open an URL {String}")
	public void user_open_an_URL(String url) throws Throwable 
	{
		driver.get(url);
	}

	@When("^User click on Register link under My Account$")
	public void user_click_on_Register_link_under_My_Account() throws Throwable 
	{
		rgstr.clickMyAccount();
	}

	@Then("^Page Title should be {String}")
	public void page_Title_should_be(String title) throws Throwable 
	{
	   if(title.equals(driver.getTitle()))
	   {
		   System.out.println("Title Displayed -> " + title);
	   }
	   else
	   {
		   System.out.println("Not Displayed");
	   }
	}

	@When("^User enters all mandatory details$")
	public void user_enters_all_mandatory_details(String fname, String lname, String email, String tnumber, String password, String cnfpwd) throws Throwable 
	{
		rgstr.setFirstName(fname);
		rgstr.setLastName(lname);
		rgstr.setemail(email);
		rgstr.setTelephone(tnumber);
		rgstr.setPassword(password);
		rgstr.setConfPassword(cnfpwd);
		
		rgstr.custAgreement();
	}

	@When("^click on Continue button$")
	public void click_on_Continue_button() throws Throwable 
	{
	    rgstr.contiue();
	    Thread.sleep(2000);
	} 

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable 
	{
	    rgstr.afterRegisterContiue();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable 
	{
	    rgstr.closeBrowser();
	}
}
