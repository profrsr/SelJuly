package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

import org.testng.annotations.BeforeClass;

public class TC002_LoginFailure extends ProjectWrappers{
	
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLoginForFailure()
		.verifyErrorMessage("Sorry, email or password is not valid/match");
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="Login to Web Store(Negative)";
		testDescription="Login (Failure) to Web Store using POM";
	}

}
