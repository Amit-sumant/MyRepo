package handleDynamaicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Complex_SVG_Graph 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0,1300)");
		
		String verMap = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String tooltip = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		List<WebElement> barlists = driver.findElements(By.xpath(verMap));
		System.out.println("Total Bars -> " + barlists.size());
		
		
		
		Actions act=new Actions(driver);
		
		for(WebElement list : barlists)
		{
			act.moveToElement(list).perform();
			Thread.sleep(500);
			
			String txtTooltip = driver.findElement(By.xpath(tooltip)).getText();
			System.out.println(txtTooltip);
		}

	}

}
