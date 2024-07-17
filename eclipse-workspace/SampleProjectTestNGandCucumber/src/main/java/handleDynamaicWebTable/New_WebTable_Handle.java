package handleDynamaicWebTable;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_WebTable_Handle 
{
	
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(opt);
		
		String url= "https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		//getting total row
		//WebElement row = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr"));
		int row = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
		System.out.println("Total Rows in - " + row);
		
		//find number of columns
		int cols = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
		System.out.println("Total Number of Columns -> " + cols);
		
		
		//retrieve specific row and columns
		String value = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[5]/td[2]")).getText();
		System.out.println(value);
		
		//get all row and columns
		//need 2 loop
		
		for(int r=1; r<=row; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				String data = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
			}
		}
		
		
		
		/*List<WebElement> rowhead = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th"));
		System.out.println(rowhead.size());
		
		for(WebElement row1 : rowhead)
		{
			System.out.println(row1.getText());
		}
		
		//get all columns
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td"));		
		System.out.println(cols.size());
		
		boolean status = false;
		
		for(WebElement c1 : cols)
		{
			//System.out.println(c1.getText());
			String value = c1.getText();
			System.out.println(value);
			
			
			if(value.contains("Sun microsystems"))
			{
				status = true;
				break;
			}
		}
		System.out.println(status);*/
	}
}
