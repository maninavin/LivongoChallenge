package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetailsPage {

	private static WebElement element = null;

	private final static String join_now_id = "#landing-button-signup[ng-disabled=\"emailCollect.$invalid\"]";
	private final static String firstName_id = "#get-started-input-firstname";
	private final static String lastName_id = "#get-started-input-lastname";
	private final static String mm_id = "#get-started-input-month";
	private final static String dd_id = "#get-started-input-day";
	private final static String yyyy_id = "#get-started-input-year";
	private final static String email_address_id = "#get-started-input-email";
	private final static String password_id = "#get-started-input-password";
	private final static String checkbox_id = ".lv-checkbox";
	private final static String submit_id = ".lv-btn.ng-binding";

	public static WebElement join_now_button(WebDriver driver) {

		element = driver.findElement(By.cssSelector(join_now_id));

		return element;

	}

	public static WebElement first_name(WebDriver driver) {

		element = driver.findElement(By.cssSelector(firstName_id));

		return element;

	}

	public static WebElement last_name(WebDriver driver) {

		element = driver.findElement(By.cssSelector(lastName_id));

		return element;

	}

	public static WebElement mm(WebDriver driver) throws InterruptedException {

		element = driver.findElement(By.cssSelector(mm_id));

		return element;

	}

	public static WebElement dd(WebDriver driver) {

		element = driver.findElement(By.cssSelector(dd_id));

		return element;

	}

	public static WebElement yyyy(WebDriver driver) {

		element = driver.findElement(By.cssSelector(yyyy_id));
		return element;

	}

	public static WebElement email_address(WebDriver driver) {

		element = driver.findElement(By.cssSelector(email_address_id));
		return element;

	}

	public static WebElement password(WebDriver driver) {

		element = driver.findElement(By.cssSelector(password_id));
		return element;

	}

	public static WebElement checkbox(WebDriver driver) {

		WebElement element = driver.findElement(By.cssSelector(checkbox_id));
		return element;

	}

	public static WebElement submit_button(WebDriver driver) {

		element = driver.findElement(By.cssSelector(submit_id));
		return element;

	}
}
