package tests.LivongoTest;

import static org.testng.Assert.assertTrue;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;

import helper.HelperMethods;
import pages.SuppliesPage;
import selenium.DriverSetup;

public class LivongoTest {

	WebDriver driver = DriverSetup.setupDriver(DriverSetup.Browser.Chrome, "chromedriver.exe");

	@Test(description = "Test case to validate title on the Coverage page")
	public void livongoTitleTest() throws Exception {

		try {

			System.out.println("Launch the Livongo URL" + "\n");
			assertTrue(HelperMethods.launch_Browser(driver), "Unable to launch the browser");

			System.out.println("Click on Join Now button" + "\n");
			assertTrue(HelperMethods.click_join_now(driver));

			System.out.println("Enter login details" + "\n");
			assertTrue(HelperMethods.enter_login_details(driver));

			System.out.println("Enter Details on supplies page" + "\n");
			assertTrue(HelperMethods.supplies_Details_Page(driver));

			System.out.println("Wait for Coverage page to load" + "\n");
			assertTrue(HelperMethods.wait_For_Page_Load_Coverage_Page(driver));

			System.out.println("Verify title of Coverage page" + "\n");
			assertTrue(HelperMethods.verify_Page_Title_Coverage(driver));

			System.out.println("Verify title of Coverage page general" + "\n");
			assertTrue(HelperMethods.verify_Page_Title_General(driver));

			System.out.println("Enter details on Coverage Page" + "\n");
			assertTrue(HelperMethods.coverage_Details_Page(driver));

		}

		catch (Exception e) {
			System.out.println("Test Falied due to: " + e.getMessage());
		}

	}

}
