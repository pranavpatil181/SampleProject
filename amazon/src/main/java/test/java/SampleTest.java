package test.java;

import org.testng.annotations.Test;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;

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
	System.out.println("Logged In");
	}
}
