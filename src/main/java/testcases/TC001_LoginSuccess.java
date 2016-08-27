package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

import org.testng.annotations.BeforeClass;

public class TC001_LoginSuccess extends ProjectWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, String name) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifySuccessMessage(name)
		.clickProfileImage()
		.clickLogout();

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to Web Store";
		testDescription="Login and Logout in Web Store using POM";
	}

	
	
	
	
	
	
}
