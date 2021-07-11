package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import static org.junit.Assert.assertEquals;

public class LoginStepDefination 
{
	WebDriver driver;
	
	@Given("^user is on Login Page$")
	public void user_is_on_login()
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("^title of Login page is nopcommerce$")
	public void title_oflogin_page() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals("Your store. Login", title);
		
	}
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws InterruptedException
	{
	    driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	    
	    driver.findElement(By.name("email")).sendKeys("a.sumant@yahoo.com");
	    driver.findElement(By.name("password")).sendKeys("Sriramsamarth@2012");
	    
	    Thread.sleep(2000);
	    
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws InterruptedException 
	{
		WebElement logButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    logButton.click();
	    
	    Thread.sleep(5000);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() 
	{
	    String loginpageTitle = driver.getTitle();
	    System.out.println(loginpageTitle);
	    assertEquals("Cogmento CRM", loginpageTitle);
	}
	
}
