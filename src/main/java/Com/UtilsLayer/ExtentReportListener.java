package Com.UtilsLayer;

import java.io.IOException;

import org.openqa.selenium.logging.Logs;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReportSetup implements ITestListener {

	@Override		
    public void onFinish(ITestContext arg0) {					
        extent.flush();			
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
    	ExtentReportSetup.extentReportSetup();
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					

    	extentTest.log(Status.FAIL, "Test case Failed ::"+result.getMethod().getMethodName());
    	
    	extentTest.log(Status.FAIL, result.getThrowable());
    	
    
    	try {
			extentTest.addScreenCaptureFromPath(TestUtility.getScreenShotForFailedTC(result.getMethod().getMethodName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
    	extentTest.log(Status.SKIP,"Test Case is skipped is :: "+result.getMethod().getMethodName());
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
    	extentTest=extent.createTest(result.getMethod().getMethodName());
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					

    	extentTest.log(Status.PASS, "Test Case passed is ::"+result.getMethod().getMethodName());
    
    	try {
			extentTest.addScreenCaptureFromPath(TestUtility.getScreenShotForPassedTC(result.getMethod().getMethodName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
	
}
