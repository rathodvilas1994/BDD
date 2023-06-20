package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='nav-cart']")
	WebElement carticon; 
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement hoverelement;
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-signin-button']")
	WebElement signinbutton;  
	
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement emailaddress;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement finalsignin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String uname) 
	{	
		Actions act=new Actions(driver);
		act.moveToElement(hoverelement).perform();
		
		signinbutton.click();
		
		emailaddress.sendKeys(uname);
		
		continuebutton.click();
		
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);	
	}
	public void finalSignin()
	{
		finalsignin.click();
	}
	public String getTitleOfPage() 
	{
		String title = driver.getTitle();
		
		return title;
	}
	public boolean isCartdisplaying() 
	{
		boolean isdisplay = carticon.isDisplayed();
		
		return isdisplay;
	}

}
