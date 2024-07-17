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

public class SVG_Graph_Example 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://www.worldometers.info/coronavirus/country/india/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0,1400)");
		
		Thread.sleep(1500);
		
		WebElement txt = driver.findElement(By.xpath("//div[@class='col-md-12']//h3[contains(text(),'Total Coronavirus Cases in India')]"));
		System.out.println(txt.getText());
		
		List<WebElement> grlist = driver.findElements(By.xpath("(//*[local-name()='svg' and @class='highcharts-root'])[2]//*[name()='rect']"));
		
		Actions act=new Actions(driver);
		for(WebElement graphlist : grlist)
		{
			act.moveToElement(graphlist).perform();
			Thread.sleep(1000);
			String tooltip = driver.findElement(By.xpath("//div[@id='highcharts-hyr6tbt-2483']//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']")).getText();
			System.out.println(tooltip);
		}

	}

}
