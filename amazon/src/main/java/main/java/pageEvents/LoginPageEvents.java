package main.java.pageEvents;

import org.testng.Assert;


import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;

public class LoginPageEvents {
	
	public void verifyLoginPageOpened() {
		ElementFetch elementFetch= new ElementFetch();
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0,"Login Page did not Open");
	}
	public void enterEmailID() {
		ElementFetch elementFetch= new ElementFetch();
		elementFetch.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("ppranavpatil181@gmail.com");
		
	}
	public void cliclonContinueButton() {
		ElementFetch elementFetch= new ElementFetch();
		elementFetch.getWebElement("XPATH", LoginPageElements.continueButton).click();
		
	}
	
	public void enterPassword() {
		ElementFetch elementFetch= new ElementFetch();
		elementFetch.getWebElement("XPATH", LoginPageElements.password).sendKeys("roman181");
		
	}
	
	public void cliclonSignInButton() {
		ElementFetch elementFetch= new ElementFetch();
		elementFetch.getWebElement("XPATH", LoginPageElements.signinButton).click();
		
	}
}
