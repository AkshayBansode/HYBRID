package Com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.LoginPage;
import Com.UtilsLayer.JSMethods;
import Com.UtilsLayer.UtilsClass;

public class LoginPageTest extends BaseClass{
	LoginPage loginpage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}
	
	@Test
	public void validateLoginFunctionality() throws InterruptedException {
		loginpage=new LoginPage();
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		
		loginpage.clickOnLoginButton();
		Thread.sleep(5000);
		JSMethods.alertPop();
		
		Thread.sleep(5000);
		
		UtilsClass.clickonOkButtonInAlertPop();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
