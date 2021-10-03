package Com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.BaseLayer.BaseClass;

public class TestUtility extends BaseClass {

	public static String getScreenShotForPassedTC(String screenShotName) throws IOException {

		String dateName=new SimpleDateFormat("__ddMMyyyy_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Finaldistination=System.getProperty("user.dir")+"/PassTestCaseScreenShot/"+screenShotName+dateName+".png";
		File finalDist = new File(Finaldistination);
		FileUtils.copyFile(source, finalDist);
		return Finaldistination;
	}
	
	
	public static String getScreenShotForFailedTC(String screenShotName) throws IOException {
		SimpleDateFormat dateFormat= new SimpleDateFormat("__ddMMyyyy_HHmmss");
		String dateName=dateFormat.format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String Finaldistination=System.getProperty("user.dir")+"/FailedTestCaseScreenShot/"+screenShotName+dateName+".png";
		File finalDist = new File(Finaldistination);
		FileUtils.copyFile(source, finalDist);
		return Finaldistination;
	}

	public static void setDateForLog4j() {
	
		SimpleDateFormat dateFormat= new SimpleDateFormat("__ddMMyyyy_HHmmss");
		
		System.setProperty("current_date", dateFormat.format(new Date()));
		
		PropertyConfigurator.configure("./src/main/resources/log4j.properties");
		
	}
	
	
	
	
	
}
