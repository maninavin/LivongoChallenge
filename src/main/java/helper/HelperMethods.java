package helper;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertTrue;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.google.common.collect.Ordering;

import dataProviders.ConfigFileReader;
import selenium.DriverSetup;

import helper.HelperMethods;
import pages.CoveragePage;
import pages.LoginDetailsPage;
import pages.SuppliesPage;

public class HelperMethods {

	static WebDriver driver = null;

	/**
	 * This method launches the browser and verifies the title. Usage:
	 * assertTrue(launch_Browser) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean launch_Browser(WebDriver driver) {

		try {
			String url = ConfigFileReader.getURL();
			driver.get(url);
			driver.manage().window().maximize();
			String pageTitle = driver.getTitle();
			while (pageTitle.equals("Livongo Health - Registration")) {
				return true;

			}
			return false;

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could not launch the browser");
			return false;
		}
	}

	/**
	 * This method will click on Join Now button. Usage: assertTrue(click_join_now)
	 * == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean click_join_now(WebDriver driver) {
		try {
			CommonMethods.element_click("CSS", LoginDetailsPage.join_now_button(driver));
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Join now button is not clicked");
			return false;
		}

	}

	/**
	 * This method will enter login details. Usage: assertTrue(enter_login_details)
	 * == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean enter_login_details(WebDriver driver) {
		try {

			CommonMethods.enter_text("ID", LoginDetailsPage.first_name(driver), ConfigFileReader.getFirstName());
			CommonMethods.enter_text("ID", LoginDetailsPage.last_name(driver), ConfigFileReader.getLastName());
			CommonMethods.enter_text("ID", LoginDetailsPage.mm(driver), ConfigFileReader.mM());
			CommonMethods.enter_text("ID", LoginDetailsPage.dd(driver), ConfigFileReader.dD());
			CommonMethods.enter_text("ID", LoginDetailsPage.yyyy(driver), ConfigFileReader.yYYY());
			CommonMethods.enter_text("ID", LoginDetailsPage.email_address(driver), ConfigFileReader.emailAddress());
			CommonMethods.enter_text("ID", LoginDetailsPage.password(driver), ConfigFileReader.password());
			CommonMethods.element_click("CSS", LoginDetailsPage.checkbox(driver));
			CommonMethods.element_click("CSS", LoginDetailsPage.submit_button(driver));

			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Login details are not entered properly");
			return false;
		}

	}

	/**
	 * This method will verify the title of coverage page. Usage:
	 * assertTrue(enter_login_details) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean verify_Page_Title_Coverage(WebDriver driver) {

		try {

			String pageTitle = CoveragePage.coverage_Title(driver).getText();

			System.out.println("Title/Heading of coverage page is : " + pageTitle + "\n");

			while (pageTitle.equals("Who has you covered?")) {
				return true;

			}
			return false;

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could not get the Coverage page title");
			return false;
		}
	}

	/**
	 * This method will verify the title in general. Usage:
	 * assertTrue(enter_login_details) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean verify_Page_Title_General(WebDriver driver) {

		try {

			String pageTitle = driver.getTitle();
			System.out.println("Title of the page is : " + pageTitle + "\n");

			while (pageTitle.equals("Livongo Health - Registration")) {
				return true;

			}
			return false;

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could get the page title");
			return false;
		}
	}

	/**
	 * This method will enter supplies details. Usage:
	 * assertTrue(supplies_Details_Page) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean supplies_Details_Page(WebDriver driver) {
		try {
			CommonMethods.enter_text("CSS", SuppliesPage.street_address(driver), ConfigFileReader.streetAddress());
			CommonMethods.enter_text("CSS", SuppliesPage.apt_no(driver), ConfigFileReader.aptNo());
			CommonMethods.enter_text("CSS", SuppliesPage.city(driver), ConfigFileReader.city());
			CommonMethods.element_click("CSS", SuppliesPage.state_dropdown(driver));
			CommonMethods.element_click("CSS", SuppliesPage.state_dropdown_CA(driver));
			CommonMethods.enter_text("CSS", SuppliesPage.zip_code(driver), ConfigFileReader.zipcode());
			CommonMethods.enter_text("CSS", SuppliesPage.mobile_phone_no(driver), ConfigFileReader.phoneNo());
			CommonMethods.element_click("CSS", SuppliesPage.coverage_button(driver));
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Supplies details are not entered properly");
			return false;
		}

	}

	/**
	 * This method will enter coverage details. Usage:
	 * assertTrue(coverage_Details_Page) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean coverage_Details_Page(WebDriver driver) {
		try {
			CommonMethods.enter_text("CSS", CoveragePage.reg_code(driver), ConfigFileReader.regCode());
			CommonMethods.element_click("CSS", CoveragePage.reg_code_dropdown_select(driver));
			CommonMethods.element_click("CSS", CoveragePage.insurance_provider(driver));
			CommonMethods.element_click("CSS", CoveragePage.united_healthcare(driver));
			CommonMethods.enter_text("CSS", CoveragePage.member(driver), ConfigFileReader.member());
			CommonMethods.enter_text("CSS", CoveragePage.group(driver), ConfigFileReader.group());
			CommonMethods.element_click("CSS", CoveragePage.health_button(driver));
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Supplies details are not entered properly");
			return false;
		}

	}

	/**
	 * This method will wait for page load of coverage page. Usage:
	 * assertTrue(wait_For_Page_Load_Coverage_Page) == True
	 * 
	 * @author M.Subramaniam
	 */

	public static boolean wait_For_Page_Load_Coverage_Page(WebDriver driver) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.textToBe(
					By.cssSelector("#step-container > div > div.step-title.ng-binding.ng-scope"),
					"Who has you covered?"));
			return true;

		} catch (Exception e) {
			return false;
		}
	}
}
