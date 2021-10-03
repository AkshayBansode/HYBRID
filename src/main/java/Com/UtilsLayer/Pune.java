package Com.UtilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Com.BaseLayer.BaseClass;

public class Pune extends BaseClass implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		
		System.out.println("Before click on Alert Pop accept Button ");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		
		System.out.println("After click on Alert Pop ccept Button ");
			
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("After click on Alert Pop cancel Button ");
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {

		System.out.println("Before click on Alert Pop cancel  Button ");

	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {

		System.out.println("Before Navigating to :" + url);
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigating to :" + url);
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigating back ");
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {

		
		System.out.println("After Navigating back ");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		
		System.out.println("Before Navigating forward ");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		
		System.out.println("After Navigating forward ");

	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Trying to find element By "+by.toString());
	
	
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Element is found : "+by.toString());
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {

		System.out.println("Trying to Click on : " + element.toString());

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Clicked on : " + element.toString());

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("Value of  "+element.toString());
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("Element value is changed to  "+element.toString());
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {

		System.out.println("Exception Occur  Pune =================  Mumbai");
		
		
		UtilsClass.captureScreenShotAtEnd("abc");
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub

	}

}
