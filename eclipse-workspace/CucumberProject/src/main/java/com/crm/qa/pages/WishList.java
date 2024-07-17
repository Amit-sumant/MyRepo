package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class WishList extends TestBase 
{
	@FindBy(xpath = "//p[contains(text(),'Your wish list is empty.')]")
	WebElement emptyWishlist;
	
	@FindBy (xpath = "//a[contains(text(),'Continue')]")
	WebElement btnContinue;
	
	@FindBy(xpath = "(//a[contains(text(),'Wish List')])[1]")
	WebElement linkWishList;
	
	
	public WishList()
	{
		PageFactory.initElements(driver, this);// driver coming from TestBase class
		// "this" means pointing to the current class object. instead of this we can
		// also write LoginPage.class
		System.out.println("Entered into Page");
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public void wishlistPage()
	{
		linkWishList.click();
		createWishList();
	}
	
		
	public void createWishList()
	{
		if(emptyWishlist.isDisplayed())
		{
			String emptyLabel = emptyWishlist.getText();
			System.out.println("Your Text is -> " + emptyLabel);
			
			btnContinue.click();
		}
	}

}
