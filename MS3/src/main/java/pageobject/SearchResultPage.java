package pageobject;

import org.openqa.selenium.WebDriver;

import Uistore.AppUI;
import utilities.Log;

public class SearchResultPage {
	WebDriver driver;
	AppUI a = new AppUI();

	public SearchResultPage(WebDriver driver) {
		Log.info("HomePage opened");
		this.driver = driver;
	}

	public void clickSearch() {
		driver.findElement(a.search).click();
		Log.info("Search button clicked");
	}

	public void enterSearch() {
		driver.findElement(a.searchBox).sendKeys("Car");
		;
		Log.info("Search box clicked");
	}

	public void clickSearchButton() {
		driver.findElement(a.searchButton).click();
		Log.info("Search button clicked");
	}

	public void validateTest() {
		if (driver.findElement(a.searchResult).getText().endsWith("Car")) {
			Log.info("Car found");
		}
	}
}
