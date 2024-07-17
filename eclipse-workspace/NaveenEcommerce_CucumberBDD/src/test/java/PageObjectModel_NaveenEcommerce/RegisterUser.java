package PageObjectModel_NaveenEcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser
{
	public static WebDriver rdriver;
	
	public RegisterUser(WebDriver ldriver)
	{
		rdriver = ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement myaclink;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;
	
	@FindBy(id="input-firstname")
	WebElement txtFirstName;
	
	@FindBy(id="input-lastname")
	WebElement txtLastName;
	
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(id="input-telephone")
	WebElement txtTelephone;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(id="input-confirm")
	WebElement txtConfPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement agreeCheckbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement btnRegisCont;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	WebElement btnLogOff;
	
	public void clickMyAccount() throws InterruptedException
	{
		myaclink.click();
		Thread.sleep(2000);
		register.click();
	}
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tnumber)
	{
		txtTelephone.sendKeys(tnumber);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfPassword(String cnfPassword)
	{
		txtConfPassword.sendKeys(cnfPassword);
	}
	
	public void custAgreement()
	{
		agreeCheckbox.click();
	}
	
	public void contiue()
	{
		btnContinue.click();
	}
	
	public void afterRegisterContiue()
	{
		btnRegisCont.click();
	}
	
	public void closeBrowser()
	{
		btnLogOff.click();
	}
}
