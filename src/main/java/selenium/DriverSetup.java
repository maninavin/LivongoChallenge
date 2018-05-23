package selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverSetup {

	static String pathToDriver = Paths.get("").toAbsolutePath().toString() + File.separator + "driverExecutables"
			+ File.separator;
	static String pathToPropertiesFile = Paths.get("").toAbsolutePath().toString() + File.separator + "Configuration"
			+ File.separator;
	
	


	public enum Browser {
		Chrome, IE, Firefox
	}

	public static WebDriver setupDriver(Browser browser, String driverFileName) {
		WebDriver driver = null;
		String osName = (System.getProperty("os.name").toLowerCase().contains("mac") ? "mac" : "windows");
		if (browser == Browser.Chrome) {
			if (osName.equals("windows")) {
				System.setProperty("webdriver.chrome.driver", pathToDriver + driverFileName);
			} else {
				System.setProperty("webdriver.chrome.driver", pathToDriver + driverFileName);
			}
			driver = new ChromeDriver();
		}

		else if (browser == Browser.Firefox) {
			// Add config
		}

		else if (browser == Browser.IE) {
			// Add config
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	
}
