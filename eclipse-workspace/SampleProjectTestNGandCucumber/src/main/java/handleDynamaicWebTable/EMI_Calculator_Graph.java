package handleDynamaicWebTable;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class EMI_Calculator_Graph 
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		ChromeDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0,1800)");
		
		

	}

}
