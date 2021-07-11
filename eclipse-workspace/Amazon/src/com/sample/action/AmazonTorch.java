package com.sample.action;

import org.openqa.selenium.WebElement;

public class AmazonTorch {
	
	public static void searchTorch(String Trch1)
	{
		WebElement srch = DriverFactory.driver.findElement(AmazonLoginobjectRepository.srch);
		srch.sendKeys(Trch1);
		srch.submit();
	}

}
