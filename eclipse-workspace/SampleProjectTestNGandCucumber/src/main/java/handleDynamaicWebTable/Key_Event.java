package handleDynamaicWebTable;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Event 
{
	static WebDriver driver;
	
	public static void main(String args[]) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String url = "https://text-compare.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement ele2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		ele1.sendKeys("Welcome to Selenium Java Course");
		
		Actions act=new Actions(driver);
		
		//Ctrl A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a"); // ctrl a
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("Value perform control A");
		
		//Ctrl C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("Value perform control C");
		
		// TAB - shift to input 2
		
		act.sendKeys(Keys.TAB);
		act.perform();
		System.out.println("Value perform control Tab");
		
		//Ctrl V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("Value perform control V");
		
		//compare text
		
		if(ele1.getAttribute("value").equals(ele2.getAttribute("value")))
		
			System.out.println("Text NOt Copied");
			else
				System.out.println("Text not Copied");
		
		takeScreenshot();
		
	}
	
	public static void takeScreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File scvtrg = new File(".\\screenshots\\home.jpeg");
		FileUtils.copyFile(srcfile, scvtrg);
	}

}
