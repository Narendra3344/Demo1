package pageobject;

import org.openqa.selenium.WebDriver;

import Uistore.AppUI;
import utilities.Log;

public class HomePage {
	WebDriver driver;
	AppUI a = new AppUI();

	public HomePage(WebDriver driver) {
		Log.info("HomePage opened");
		this.driver = driver;
	}

	public void clickCovid() {
		driver.findElement(a.covid).click();
		Log.info("Covid close button clicked");
	}

	public void clickAbout() {
		driver.findElement(a.about).click();
		Log.info("About clicked");
	}

}