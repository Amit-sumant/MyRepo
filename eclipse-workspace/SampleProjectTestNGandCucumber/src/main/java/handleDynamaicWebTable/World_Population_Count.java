package handleDynamaicWebTable;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class World_Population_Count 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//String world_population = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		//String today_Population = "//div[@class='col1in']//parent::div[@class='col-sm-6 col-counters']";
		//String this_year = "//div[@class='col2in']//parent::div[@class='col-sm-6 col-counters']";
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*while(true)  //for world population
		{
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
		
			for(WebElement elenm : ele)
			{
				Thread.sleep(1000);
				System.out.println(elenm.getText());
			}
		}*/ //for world population
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		while(true) // for Today and this year
		{
			List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='col1in' or class='col2in']//parent::div[@class='col-sm-6 col-counters']"));
		
			for(WebElement e : ele1)
			{
				Thread.sleep(1000);
				System.out.println(e.getText());
				break;
			}
		
		}
		
		
		
	
	}
	
	public static void countPopulation(String locator) throws InterruptedException
	{
		while(true)
		{
			List<WebElement> ele = driver.findElements(By.xpath(locator));
		
			for(WebElement elenm : ele)
			{
				Thread.sleep(1000);
				System.out.println(elenm.getText());
				
			}
		}
	}
	
	public static void todaypopulation(String loc)
	{
		while(true)
		{
			List<WebElement> ele1 = driver.findElements(By.xpath(loc));
		
			for(WebElement e : ele1)
			{
				System.out.println(e.getText());
				break;
			}
		
		}
	}
	
	public static void thisYear(String loc1)
	{
		while(true)
		{
			List<WebElement> yer = driver.findElements(By.xpath(loc1));
			
			for(WebElement ell : yer)
			{
				System.out.println(ell.getText());
				break;
			}
		}
	}
}
