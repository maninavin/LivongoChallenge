package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuppliesPage {

	private static WebElement element = null;

	private final static String street_address_id = "#shipping-street-address";
	private final static String apt_no_id = "#shipping-street-address2";
	private final static String city_id = "#shipping-city";
	private final static String state_dropdown_id = "#shipping-select-state";
	private final static String zip_code_id = "#shipping-zip-code";
	private final static String mobile_phone_no_id = "#shipping-input-phone";
	private final static String coverage_button_id = ".lv-btn.ng-binding";
	private final static String state_dropdown_CA = "#ancorCA";

	public static WebElement street_address(WebDriver driver) {

		element = driver.findElement(By.cssSelector(street_address_id));

		return element;

	}

	public static WebElement apt_no(WebDriver driver) {

		element = driver.findElement(By.cssSelector(apt_no_id));

		return element;

	}

	public static WebElement city(WebDriver driver) {

		element = driver.findElement(By.cssSelector(city_id));

		return element;

	}

	public static WebElement state_dropdown(WebDriver driver) throws InterruptedException {

		element = driver.findElement(By.cssSelector(state_dropdown_id));

		return element;

	}

	public static WebElement zip_code(WebDriver driver) {

		element = driver.findElement(By.cssSelector(zip_code_id));

		return element;

	}

	public static WebElement mobile_phone_no(WebDriver driver) {

		element = driver.findElement(By.cssSelector(mobile_phone_no_id));
		return element;

	}

	public static WebElement coverage_button(WebDriver driver) {

		element = driver.findElement(By.cssSelector(coverage_button_id));
		return element;

	}

	public static WebElement state_dropdown_CA(WebDriver driver) {

		element = driver.findElement(By.cssSelector(state_dropdown_CA));
		return element;

	}
	
	
}
