package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination 
{
	
	WebDriver driver;
	
	@Given("^user is login page$")
	public void user_alraedy_on_home_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\eclipse-workspace\\NopcommerceBDDFramework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Enter user name and password
		driver.findElement(By.id("//@input[@id='Email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("//@input[@id='Email']")).sendKeys("admin@yourstore.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		//click on Submit
		WebElement logBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		logBtn.click();
		
	}
	
	/*@When("^title of login page is nopcommerce$")
	public void title_of_login_page_is_nopcommerce() throws Throwable {
	    
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   
	}*/
	

}
