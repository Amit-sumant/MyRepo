package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Dynamic_WebTable 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		driver.get("https://ui.cogmento.com/tasks");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("email")).sendKeys("ameet.s2012@gmail.com");
		System.out.println("Receieve login");
		Thread.sleep(500);
		
		driver.findElement(By.name("password")).sendKeys("SriramArnav@2012");
		System.out.println("Receieve Password");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='top-header-menu']"));
		System.out.println(ele.getText());
		
		Thread.sleep(1000);
		
		List<WebElement> listrow = driver.findElements(By.xpath("//div[@class='table-wrapper']//table/thead/tr/th"));
		System.out.println(listrow.get(1).getText());
		
	
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]
		
		/*String before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1;i<=4;i++)
		{
			
			String strpath = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(strpath);
			
			if(strpath.equals("mr"))
			{
				////*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[1]/div/input
				//"//div[@class='table-wrapper']//table/tbody/tr["+i+"]/td[1]//div/input[@type='checkbox']"
				//div[@class='table-wrapper']//table/tbody/tr["+i+"]/td[1]//div/input
				driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/div/table/tbody/tr[4]/td[1]/div/input")).click();
			}
			
		}*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Mr.')]//parent::td//preceding-sibling::td//input[@name='id']")).click();
		
		//driver.close();

	}

}
