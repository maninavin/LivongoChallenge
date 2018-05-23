package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	static WebDriver driver = null;

	public static boolean element_click(String attribute, WebElement element_id) {
		try {
			if (attribute == "CSS") {
				element_id.click();
				return true;
			}
			if (attribute == "ID") {
				element_id.click();
				return true;
			}
			if (attribute == "Xpath") {
				element_id.click();
				return true;
			}
			if (attribute == "Name") {
				element_id.click();
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}

	}

	public static boolean enter_text(String attribute, WebElement element_id, String data) {
		try {
			if (attribute == "CSS") {
				element_id.sendKeys(data);
				return true;
			}
			if (attribute == "ID") {
				element_id.sendKeys(data);
				return true;
			}
			if (attribute == "Xpath") {
				element_id.sendKeys(data);
				return true;
			}
			if (attribute == "Name") {
				element_id.sendKeys(data);
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}

	}
}
