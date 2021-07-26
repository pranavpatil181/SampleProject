package test.java;

import java.io.IOException;

import org.testng.annotations.Test;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;
import main.java.utils.ReadWriteExcelFile;

public class SampleTest extends BaseTest{

	@Test
	public void sampleMethodForEmailEntering() {
	HomePageEvents homePageEvents=new HomePageEvents();
	homePageEvents.clickOnSignInButton();
	LoginPageEvents loginPageEvents=new LoginPageEvents();
	loginPageEvents.verifyLoginPageOpened();
	loginPageEvents.enterEmailID();
	
	loginPageEvents.cliclonContinueButton();
	loginPageEvents.enterPassword();
	loginPageEvents.cliclonSignInButton();
	ReadWriteExcelFile excel = new ReadWriteExcelFile();
	try {
		excel.getData("data.xlsx", "Sheet1");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("\nLogged In");
	}
}
