package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	//we have created Object repositories with the help of POM with Page Factory
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	
	//Initilize OR 
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginbutton.click();
	}
	
	
}
