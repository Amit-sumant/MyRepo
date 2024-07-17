package com.nopecommerce.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.nopecommerce.qa.base.TestBase;

public class HomePage extends TestBase 
{

	public HomePage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}

}
