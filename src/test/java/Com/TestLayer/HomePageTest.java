package Com.TestLayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.HomePage;

public class HomePageTest  extends BaseClass{
	HomePage homepage;
	LoginPageTest loginpagetest;
	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
		homepage=new HomePage();
		loginpagetest=new LoginPageTest();
	}
	
	@Test(priority=1)
	public void validateLoginPage() {
		loginpagetest.validateLoginFunctionality();
	}
	
	@Test(priority=2)
	public void validateHomePageLogo() {
		boolean actualLogoStatus=homepage.validatelogo();
		Assert.assertEquals(actualLogoStatus, true);
	}
	
	@Test(priority=3)
	public void validateLoggedUsername() {
		String actualloggeduserename=homepage.validateLoggedusername();
		Assert.assertEquals(actualloggeduserename,"Praful Pawar");
	}
	
	@Test(priority=4)
	public void validateHomePageTitle() {
		String actualTitle=homepage.validateTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
	}
	
	@Test(priority=5)
	public void validateHomeUrl() {
		String actualurl=homepage.validateUrl();
		Assert.assertEquals(actualurl, "https://ui.cogmento.com/");
	}
	
	@Test(priority=6)
	public void validateContactLink() {
		homepage.validateContactLink();
	}
	
	@Test(priority=7)
	public void validateDealsLink() {
		homepage.validateDealsLink();
	}
	
	@Test(priority=8)
	public void validateCompanies() {
		homepage.validateCompaniesLink();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
