package xlsReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xlsUtilClass 
{
	

	public static void main(String[] args) 
	{
		String url = "https://naveenautomationlabs.com/opencart/";
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome 103\\chromedriver_win32 103\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		we.click();
		WebElement we1 = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		we1.click();
		
		WebElement userNm=driver.findElement(By.id("input-email"));
		WebElement userPwd=driver.findElement(By.id("input-password"));
		
		
		Xls_Reader xls=new Xls_Reader("./src/main/java/xlsReader/Book1.xlsx");
		
		String sheetname = "Sheet1";
		
		int rowCnt = xls.getRowCount(sheetname);
		
		for(int rowNum=2; rowNum<=rowCnt; rowNum++)
		{
			String getuserName = xls.getCellData(sheetname, "Username", rowNum);
			String getuserPassword = xls.getCellData(sheetname, "Password", rowNum);
			
			System.out.println("User Name -> " + getuserName + " " +  "and Password -> " + getuserPassword);
			
			userNm.sendKeys(getuserName);
			userPwd.sendKeys(getuserPassword);
			
		}
		
	}

}
