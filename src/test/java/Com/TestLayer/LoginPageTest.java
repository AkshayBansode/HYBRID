package Com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	LoginPage loginpage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}
	
	@Test
	public void validateLoginFunctionality() {
		loginpage=new LoginPage();
		loginpage.typeUsername("praf002@gmail.com");
		loginpage.typePassword("Pr@ful0812");
		
		loginpage.clickOnLoginButton();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
