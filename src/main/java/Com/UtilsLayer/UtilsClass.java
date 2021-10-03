package Com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	public static Select sel;
	public static 	Alert act=driver.switchTo().alert();

	//Handle drop Down
	
	public static void validateDropDown(WebElement wb,String visibletext) {
		sel=new Select(wb);
		sel.selectByVisibleText(visibletext);
	}
	
	//Count drop Down Value
	public static int countDropDownValue() {
			List<WebElement> ls=sel.getOptions();
			int dpCount=ls.size();
			return dpCount;
	}
	
	//Handle Alert Pop
	public static void validateAlertPop() {
			act.accept();
	}
	
	//captrue alert message
	public static String captureAlertPopMessage() {
		String alertMessage=act.getText();
		return alertMessage;
	}
	
	public static void clickonOkButtonInAlertPop() {
		Alert act=driver.switchTo().alert();
		act.accept();
	}
	
	//Explicit wait
	public static void explicitWait(By variableName, int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(variableName));
	}
	
	//handle Frame  switch to child frame
	public static void switchtoFrame(int frameIndex) {
			driver.switchTo().frame(frameIndex);
	}
	
	//handle Frame  switch to top frame
	public static void switchtoTopFrame() {
		driver.switchTo().defaultContent();
	}
	
		//capture screenshot
		
		public static void captureScreenShotAtEnd(String dis) {
			
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File(System.getProperty("user.dir")+"\\Sceenshot\\"+ dis+".png");
		
		try {
			FileUtils.copyFile(source, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
