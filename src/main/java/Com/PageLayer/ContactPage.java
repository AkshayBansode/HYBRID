package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement CreateButton;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="middle_name")
	WebElement middleName;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']")
	WebElement accessPublicButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[1]")
	WebElement accessPublicDropDown;
	
	@FindBy(xpath="//div[@class='selected item']")
	WebElement accessPublicNameSelectedFromDp;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validatecreateButton() {
		CreateButton.click();
	}
	
	public void validateFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void validateLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void validatemiddleName(String middlename) {
		middleName.sendKeys(middlename);
	}
	
	public void validatecompanyName(String companyename) {
		company.sendKeys(companyename);
	}
	
	
	public void validateAccesspublicButton() {
		accessPublicButton.click();
	}
	
	public void validatepublicAccessDp() {
		accessPublicDropDown.click();
	}
	
	public void validatepublicAccessDpitem() {
		accessPublicNameSelectedFromDp.click();
	}
	
	public void validateSavebutton() {
		saveButton.click();
	}
	
	
	
	
}
