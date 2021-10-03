package Com.TestLayer;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.ContactPage;
import Com.PageLayer.HomePage;
import Com.UtilsLayer.ExcelReader;
import Com.UtilsLayer.TestUtility;

public class ContactPageTest extends BaseClass {
	
	LoginPageTest loginpagetest;
	HomePageTest homepageTest;
	ContactPage contactpage;
	HomePage homepage;
	


	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	
		loginpagetest = new LoginPageTest();
		homepageTest = new HomePageTest();
		contactpage = new ContactPage();
		homepage = new HomePage();
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() throws Exception {
		loginpagetest.validateLoginFunctionality();

	}

	@Test(priority = 2)
	public void validateHomePageTitle() throws InterruptedException {
		String actualTitle = homepage.validateTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
	
	}

	@Test(priority = 3)
	public void validateHomePageLogo() throws InterruptedException {
		Thread.sleep(4000);
		homepage.validateContactLink();
	}

	@Test(priority = 4)
	public void validateCreateButton() {
		contactpage.validatecreateButton();
	}

	@Test(priority = 5)
	public void validateFirstName() {
		
		ExcelReader excelData=new ExcelReader(System.getProperty("user.dir")+"/src/main/java/TestDataLayer/NewData.xlsx");
		
		String firstname=excelData.getData(1, 1, 0);
		
		contactpage.validateFirstName(firstname);
	}

	@Test(priority = 6)
	public void valideLastName() {
		contactpage.validateLastName(prop.getProperty("lastname"));
	}

	@Test(priority = 7)
	public void validateMiddleName() {
		contactpage.validatemiddleName(prop.getProperty("middlename"));
	}

	@Test(priority = 8)
	public void validatepublicAccess() {
		contactpage.validateAccesspublicButton();
	}

	@Test(priority = 9)
	public void validateDp() {
		contactpage.validatepublicAccessDp();
		contactpage.validatepublicAccessDpitem();
	}

	@Test(priority = 10)
	public void validateSaveButton() {
		contactpage.validateSavebutton();
	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}

}
