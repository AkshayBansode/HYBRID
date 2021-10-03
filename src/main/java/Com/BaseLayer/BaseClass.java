package Com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.UtilsLayer.Pune;


public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static EventFiringWebDriver e_driver;
	public static Pune eventListener;

	public BaseClass() {
		prop = new Properties();
		try {
			fis = new FileInputStream("E:\\new Script\\HybridFramworkForSeptBatch\\src\\main\\java\\ConfigLayer\\abc.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initilization() {

		String browserName = prop.getProperty("browsers");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\new Script\\HybridFramworkForSeptBatch\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("\\Drivers\\msedgedriver.exe"));
			driver = new EdgeDriver();
		} 
		else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("\\Drivers\\operadriver.exe"));
			driver = new OperaDriver();
		} 
		else {
			System.out.println("Please write correct browser name");
		}
		
		e_driver=new EventFiringWebDriver(driver);
		
		//create object WebEventListener to register with the EventFiringWebDriver
		eventListener=new Pune();
		
		
		
		e_driver.register(eventListener);
		
		
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
