package com.crm.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePageforLogin;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.WishList;
import com.crm.qa.utility.TestUtil;

public class WishListTestCase extends TestBase
{
	LoginPage lp;
	HomePageforLogin homepageforlogin;
	TestUtil testutil;
	HomePage homepage;
	WishList wishlist;
	
	
	public WishListTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		
		homepageforlogin = new HomePageforLogin(); // this is our first page
		
		lp= homepageforlogin.clickOnMyAcc();//second page is login page, hence we are calling this page here
		homepage = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		wishlist = new WishList();
	}
	
	@Test(priority=1)
	public void verifyTitle()
	{
		String validatewishlist = wishlist.validateTitle(); 
		Assert.assertEquals(validatewishlist, "My Account");
	}
	
	@Test(priority=2)
	public void clickWishList()
	{
		//wishlist = new WishList();
		wishlist.wishlistPage();
	}

	
	@AfterMethod
	public void CRMClose()
	{
		driver.quit();
	}
}
