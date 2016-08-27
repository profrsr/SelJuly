package pages;

import utils.Reporter;
import wrappers.ProjectWrappers;

public class LoginPage extends ProjectWrappers{

	public LoginPage(){

		if(!verifyTitle("TestLeaf - Login"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}
	
	public LoginPage mouseOverOnLogin() {
		mouseOverByXpath(prop.getProperty("Login.Panel.Xpath"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public LoginPage enterUserName(String data) {
		enterByName(prop.getProperty("Login.UserName.Name"), data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.Name"), data);
		return this;
	}

	public HomePage clickLogin() {
		clickByXpath(prop.getProperty("Login.LoginButton.Xpath"));
		return new HomePage();
	}
	
	public LoginPage clickLoginForFailure() {
		clickByXpath(prop.getProperty("Login.LoginButton.Xpath"));
		return this;
	}
	
	public LoginPage verifyErrorMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("Login.Error.Xpath"), data);
		return this;
	}
	
	public Registration clickSignUp() {		
		clickByLink(prop.getProperty("Login.SignUp.Link"));
		return new Registration();
	}



}
