package com.nopecommerce.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nopecommerce.qa.base.TestBase;
import com.nopecommerce.qa.pages.Register_User;

public class TestUtil extends TestBase
{
	Register_User regisuser;
	
	public static long Page_LOAD_Implicitly = 10;
	
	
	public void takeScreenShot(String fileName) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //TakeScreenshot is an Interface
		// getScreenshot is a method and return File object. And store is in File format
		//below code copy the screenshot and save into desired location
		String currentdir = System.getProperty("user.dir");
		FileUtils.copyFile(file, new File("E:\\New folder\\MyRepo\\eclipse-workspace\\NopeCommerceProject\\src\\test\\java\\Screenhots\\" 
		+ fileName + ".jpg"));
	}
	
	public void selectDropdownbox(WebElement ele, String val)
	{
		Select drpSelect=new Select(ele);
		
		List<WebElement> allOptions = drpSelect.getOptions();
		
		for(WebElement opt : allOptions)
		{
			if(opt.getText().contains(val))
			{
				opt.click();
				break;
			}
		}
		
	}

}
