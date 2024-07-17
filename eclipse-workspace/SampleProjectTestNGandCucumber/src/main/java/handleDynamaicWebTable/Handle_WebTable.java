package handleDynamaicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_WebTable 
{

	public static void main(String[] args) 
	{
		// //table[@id='customers']
		// find all columns - //table[@id='customers']//th
		// rows -> //table[@id='customers']//tr
		// //table[@id='customers']//td
		
		//only second row -> //table[@id='customers']//tr/td[4]
		
		WebDriverManager.chromedriver().setup();
		
		//below code is because of chrome ver 111 issue
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		//******************************************************
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2021/");
		
		List<WebElement> lstHeader = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("All List Headers -> " + lstHeader.size());
		
		for(WebElement ele : lstHeader)	
		{
			String strText = ele.getText();
			System.out.println(strText);
		}
		
		

	}

}
