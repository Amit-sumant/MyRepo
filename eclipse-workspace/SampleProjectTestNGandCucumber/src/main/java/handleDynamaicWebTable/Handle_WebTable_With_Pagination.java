package handleDynamaicWebTable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_WebTable_With_Pagination 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		
		String url = "https://demo.opencart.com/admin/index.php";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter username and password
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo");
		
		WebElement btnsubmit =  driver.findElement(By.xpath("//button[@type='submit']"));
		btnsubmit.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//total num of pages
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println("Your Total Number of Pages -> " + text);
		
		//below code for scroll down the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//Showing 1 to 10 of 298 (30 Pages)
		text.indexOf("(");
		text.indexOf("Pages");
		
		int total_pages = Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("Total Exact pages of -> " + total_pages);
		
		for(int i=1;i<=5;i++) //(int i=1;i<=total_pages;i++)
		{
			////span[normalize-space()='1']
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active Page Number -> " + active_page.getText());
			active_page.click();
			
			Thread.sleep(2000);
			//total rows
			List<WebElement> ele = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr"));
			for(WebElement ele1 : ele)
			{
				String str = ele1.getText();
				System.out.println(str);
			}
			
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			System.out.println("Total Number rows -> " + rows);
			
			//read all the rows from table
			for(int r=1;r<=rows;r++)
			{
				String ore_id = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
				String store = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
				String customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[4]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[5]")).getText();
				
				System.out.println(ore_id + " " + store + " " + customer + " " + status + " ");
			}
			
			Thread.sleep(1000);
			
			//below code is foe when user click on next page then respective page become active page so inter convert into sting
			String pageno = Integer.toString(i+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
		}
		
	}

}
