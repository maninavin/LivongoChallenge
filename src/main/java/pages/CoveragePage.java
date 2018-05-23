package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoveragePage {

	private static WebElement element = null;

	private final static String reg_code_id = "#coverage-input-promocode";
	private final static String reg_code_dropdown_select_id = ".code.ng-binding>b";
	private final static String insurance_provider_id = "#coverage-select-insurance";
	private final static String united_healthcare_id = "#ancorUNITEDHEALTHCARE";
	private final static String member_id = "#coverage-input-memberId";
	private final static String group_id = "#coverage-input-groupId";
	private final static String health_button_id = ".lv-btn.ng-binding";
	private final static String coverage_title_id = "#step-container > div > div.step-title.ng-binding.ng-scope";
	

	public static WebElement reg_code(WebDriver driver) {

		element = driver.findElement(By.cssSelector(reg_code_id));

		return element;

	}

	public static WebElement reg_code_dropdown_select(WebDriver driver) {

		element = driver.findElement(By.cssSelector(reg_code_dropdown_select_id));

		return element;

	}

	public static WebElement insurance_provider(WebDriver driver) {

		element = driver.findElement(By.cssSelector(insurance_provider_id));

		return element;

	}

	public static WebElement united_healthcare(WebDriver driver) throws InterruptedException {

		element = driver.findElement(By.cssSelector(united_healthcare_id));

		return element;

	}

	public static WebElement member(WebDriver driver) {

		element = driver.findElement(By.cssSelector(member_id));

		return element;

	}

	public static WebElement group(WebDriver driver) {

		element = driver.findElement(By.cssSelector(group_id));
		return element;

	}

	public static WebElement health_button(WebDriver driver) {

		element = driver.findElement(By.cssSelector(health_button_id));
		return element;

	}
	
	public static WebElement coverage_Title(WebDriver driver) {

		element = driver.findElement(By.cssSelector(coverage_title_id));
		return element;

	}


}
