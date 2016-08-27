package pages;

import utils.Reporter;
import wrappers.ProjectWrappers;

public class HomePage extends ProjectWrappers{

	public HomePage verifySuccessMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.Success.Xpath"), data);
		return this;
	}
	
	public HomePage clickProfileImage() {
		clickByXpath(prop.getProperty("Home.Image.Xpath"));
		return this;
	}

	public LoginPage clickLogout() {
		clickByXpath(prop.getProperty("Home.Logout.Xpath"));
		return new LoginPage();
	}

}
