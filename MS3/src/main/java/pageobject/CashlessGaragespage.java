package pageobject;

import org.openqa.selenium.WebDriver;

import Uistore.AppUI;
import utilities.Log;

public class CashlessGaragespage {
	WebDriver driver;
	AppUI a = new AppUI();

	public CashlessGaragespage(WebDriver driver) {
		Log.info("HomePage opened");
		this.driver = driver;
	}

	public void clickServices() {
		driver.findElement(a.services).click();
		Log.info("Cashless Garages clicked");
	}

	public void checkHeading() {
		if (driver.findElement(a.heading).getText().equals("Garage Details")) {
			Log.info("Garage Details heading found");
		}
	}
}
