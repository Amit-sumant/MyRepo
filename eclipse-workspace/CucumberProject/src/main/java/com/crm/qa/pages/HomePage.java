package com.crm.qa.pages;

import java.util.List;
import org.openqa.selenium.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//a[contains(text(),'Address Book')]")
	WebElement linkAddressbook;

	@FindBy(xpath = "//a[contains(text(),'New Address')]")
	WebElement btnNewAddress; // click on New Address button

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement enterfirstName; // enter first name

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement enterlastName; // enter last name

	@FindBy(xpath = "//input[@name='company']")
	WebElement enterCompany; // enter company

	@FindBy(xpath = "//input[@id='input-address-1']")
	WebElement enterAddress1;

	@FindBy(xpath = "//input[@id='input-city']")
	WebElement enterCity;

	@FindBy(xpath = "//input[@id='input-postcode']")
	WebElement enterPostcode;

	@FindBy(xpath = "//select[@id='input-country']")
	WebElement eleCountry;

	@FindBy(xpath = "//select[@id='input-zone']")
	WebElement eleZone;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnCont;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement btnDelete;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement deleWarningmsg;
	
	@FindBy(xpath = "(//td[@class='text-left'])[1]")
	WebElement leftTextElement;
	
	@FindBy (xpath = "//p[contains(text(),'You have no addresses in your account.')]")
	WebElement blankAddBook;
	
	@FindBy (xpath = "//a[contains(text(),'Back')]")
	WebElement btnBack;
	
	@FindBy(xpath = "(//a[contains(text(),'Wish List')])[1]")
	WebElement linkWishList;

	public HomePage() {
		PageFactory.initElements(driver, this);// driver coming from TestBase class
		// "this" means pointing to the current class object. instead of this we can
		// also write LoginPage.class
		System.out.println("Entered into Home Page");
	}

	public String validatePage() {
		return driver.getTitle();
	}

	public void homepageAction() throws InterruptedException 
	{
		linkAddressbook.click();
		
		//deleteWarningMsg();
		createanddeletemethid();

	}
	
	public void addNewAddressDtls() throws InterruptedException
	{
		// Enter address details 
				
				 enterfirstName.sendKeys("Ashwini"); 
				 enterlastName.sendKeys("Sumant");
				 enterCompany.sendKeys("Xorient"); 
				 enterAddress1.sendKeys("Pune Kothrud");
				 enterCity.sendKeys("Pune"); 
				 enterPostcode.sendKeys("100000");
				  
				 Thread.sleep(1000);
				  
				 selectCountry(); 
				 selectState();
				  
				 btnCont.click();
				 
				 Thread.sleep(1000);
				 
	}

	public String validateAddressbookPage() {
		return driver.getTitle();
	}

	public void selectCountry() {
		Select sel = new Select(eleCountry);

		List<WebElement> lstOpt = sel.getOptions();

		for (WebElement webele : lstOpt) {
			System.out.println(webele.getText()); // this is print all dropdown value

		}
		sel.selectByVisibleText("India");
		
		//we can also write element using select
		/*
		 * Select ss=new Select(driver.findElement(By.xpath("//select[@name='country_id']")));
		 * ss.selectByVisibleText("India");
		 */
	}

	public void selectState() {
		Select sel1 = new Select(eleZone);
		sel1.selectByVisibleText("Maharashtra");
		
		//selectvaluefrommultipledropdown(btnDelete, "India");
	}

	public void handlePopUp() // this function is for manage alert popups
	{
		Alert alt = driver.switchTo().alert();
		String stralert = alt.getText();
		System.out.println(stralert);

		alt.accept();

	}

	
	public void deleteWarningMsg() {
		if (!leftTextElement.isDisplayed()) {

			if (!deleWarningmsg.getText().equalsIgnoreCase("Warning: You must have at least one address!")) {
				System.out.println("Entered in this loop");
				btnDelete.click();
			} else {
				String warning = deleWarningmsg.getText();
				System.out.println(warning);
			}

		}

	}
	 
	
	public void createanddeletemethid() throws InterruptedException
	{
		try 
		{
			if(blankAddBook.isDisplayed())
			{
				System.out.println(blankAddBook.getText());
				btnNewAddress.click();
				addNewAddressDtls();
			}
		
		}catch(Exception e)
		{
			System.out.println("Entered into Catch");
			if(leftTextElement.isDisplayed())
			{
				System.out.println(leftTextElement.getSize());
				btnNewAddress.click();
				addNewAddressDtls();
				
				Thread.sleep(1000);
				
				btnDelete.click();
				handlePopUp();
				
				Thread.sleep(1000);
				
				btnDelete.click();
				handlePopUp();
				
				deleteWarningMsg();
				
				btnBack.click();
				
			}
		}
	}
	
	public WishList wishlistpage()
	{
		linkWishList.click();
		
		return new WishList();
	}
	
	public void selectvaluefrommultipledropdown(WebElement ele, String val) //this function for when we have a multiple dropdown boxes
	{
		Select seldropd=new Select(ele);
		
		List<WebElement> wel = seldropd.getOptions();
		
		for(WebElement option : wel)
		{
			if(option.getText().equals(val))
			{
				option.click();
				break;
			}
		}
		
	}

}
