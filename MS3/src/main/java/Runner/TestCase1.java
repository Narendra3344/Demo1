package Runner;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobject.HomePage;
import pageobject.SearchResultPage;
import reusablecomponent.CloseChrome;
import reusablecomponent.OpenChrome;
import utilities.Extentlog;
import utilities.Log;
import utilities.ReadPropertyFile;
import utilities.TakeSS;

public class TestCase1 {
	public static ArrayList<String> s_search_string = null;
	public static String url = null;
	public static String path = null;
	public static WebDriver driver = null;
	public static Extentlog extent = new Extentlog();
	public static ReadPropertyFile prop = new ReadPropertyFile();
	public static ExtentTest test;

	@BeforeTest
	public void Before() throws IOException {
		test = extent.startTest(TestCase1.class.getSimpleName());
		// s_search_string = prop.getItem();
		s_search_string = ExcelUtils.getdata();
		url = prop.getUrl();
		path = prop.getDriverPath();
		OpenChrome op = new OpenChrome();
		driver = op.openBrowser(driver, path, url);
	}

	@Test(priority = 1)
	public static void test() throws IOException, InterruptedException {
		try {
			Log log = new Log();
			log.config();
			HomePage h = new HomePage(driver);
			h.clickCovid();
			SearchResultPage s = new SearchResultPage(driver);
			s.clickSearch();
			s.enterSearch();
			s.clickSearchButton();
			s.validateTest();

			TakeSS S = new TakeSS();

			S.takeSnapShot(driver, "./uiic.png");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void After() {
		CloseChrome.close(driver);
		test.log(LogStatus.PASS, "browser closed succesfully");
		extent.endTest();
	}
}