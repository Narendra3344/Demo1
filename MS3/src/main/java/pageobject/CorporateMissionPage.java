package pageobject;

import org.openqa.selenium.WebDriver;

import Uistore.AppUI;
import utilities.Log;

public class CorporateMissionPage {
	WebDriver driver;
	AppUI a = new AppUI();

	public CorporateMissionPage(WebDriver driver) {
		Log.info("HomePage opened");
		this.driver = driver;
	}

	public void clickCorporate() {
		driver.findElement(a.corporate).click();
		Log.info("Corporate button clicked");
	}

	public void checkCorpo() {
		if (driver.findElement(a.corpo).getText().equals("Corporate Mission")) {
			Log.info("Corporate Mission found");
		}
	}
}
