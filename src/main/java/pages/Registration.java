package pages;

import utils.Reporter;
import wrappers.ProjectWrappers;

public class Registration extends ProjectWrappers{

	public Registration() {
		if(!verifyTitle("TestLeaf - Registration"))
			Reporter.reportStep("This is not Registration Page", "FAIL");
	}	

	
	public Registration enterFirstName(String data) {
		enterByName(prop.getProperty("Reg.FirstName.Name"), data);
		return this;
	}

	
	public Registration enterLastName(String data) {
		enterByName(prop.getProperty("Reg.LastName.Name"), data);
		return this;
	}

	
	public Registration enterUserName(String data) {
		enterByName(prop.getProperty("Reg.Email.Name"), data);
		return this;
	}

	public Registration enterPassword(String data) {
		enterByName(prop.getProperty("Reg.Password.Name"), data);
		return this;
	}

	public Registration clickSubmit() {
		clickByXpath(prop.getProperty("Reg.SubmitButton.Xpath"));
		return this;
	}
	
	public Registration verifySuccess(String data) {
		verifyTextContainsByXpath(prop.getProperty("Reg.Message.Xpath"),data);
		return this;
	}
	
	public LoginPage clickGoToLogin() {
		clickByXpath(prop.getProperty("Login.LoginButton.Xpath"));
		return new LoginPage();
	}

}
