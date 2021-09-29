package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//*[@class='header item']")
	WebElement Logo;
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement loggedUsername;
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/companies']")
	WebElement companiesLink;
	
	@FindBy(xpath="//a[@href='/deals']")
	WebElement dealsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatelogo() {
		boolean actuallogoStatus=Logo.isDisplayed();
		return actuallogoStatus;
	}
	
	public String validateLoggedusername() {
		String actualloggedusername=loggedUsername.getText();
		return actualloggedusername;
	}
	
	public String validateTitle() {
		String actualTitle=driver.getTitle();
		return actualTitle;
	}
	
	public String validateUrl() {
		String actualUrl=driver.getCurrentUrl();
		return actualUrl;
	}
	
	public void validateContactLink() {
		contactLink.click();
	}
	
	public void validateCompaniesLink() {
		companiesLink.click();
	}
	
	
	public void validateDealsLink() {
		dealsLink.click();
	}
		
		
}