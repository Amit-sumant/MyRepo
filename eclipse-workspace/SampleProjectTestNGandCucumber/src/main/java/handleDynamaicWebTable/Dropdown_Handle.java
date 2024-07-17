package handleDynamaicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Handle 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement eleTitle = driver.findElement(By.xpath("//div[@class='page_heading']/h1[contains(text(),'DropDown Menu')]"));
		System.out.println(eleTitle.getText());

	}

}
