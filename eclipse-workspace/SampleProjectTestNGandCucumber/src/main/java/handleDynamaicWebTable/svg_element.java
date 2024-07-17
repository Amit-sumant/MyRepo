package handleDynamaicWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class svg_element 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// (//*[local-name()='svg'])//parent::a[@aria-label='Google apps']
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele= driver.findElement(By.xpath("(//*[local-name()='svg'])//parent::a[@aria-label='Google apps']"));
		ele.click();
		
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Translate')]"));
		System.out.println(ele1.getText()); 
		ele1.click();
		

	}

}
