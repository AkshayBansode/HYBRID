package Com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass {

	public static Actions act;
	// Click on Element by using Actions Class

	public static void clickOnElement(WebElement wb) {
		act = new Actions(driver);
		act.click(wb).build().perform();
	}

	// Double click on element by using Actions class
	public static void doubleClickOnElement(WebElement wb) {
		act.doubleClick(wb).build().perform();
	}

	// right click on element by using action classs
	public static void rightClickOnElement(WebElement wb) {
		act.contextClick(wb).build().perform();
	}

	// send data by using action class

	public static void sendDataOnElement(WebElement wb, String data) {
		act.click(wb).sendKeys(data).build().perform();
	}

	// DragAndDrop By action class
	public static void dragAndDrop(WebElement source, WebElement target) {
		act.dragAndDrop(source, target).release().build().perform();
	}

	// mouse over on element by using action class
	public static void mouseOverOnElement(WebElement wb) {
		act.moveToElement(wb).build().perform();
	}
	
	//move end of page 
	public static void moveEndOfPage() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	
	//Move top of page
	public static void moveTopOfPage() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	
	

}
