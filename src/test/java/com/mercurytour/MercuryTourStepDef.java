package com.mercurytour;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MercuryTourStepDef extends MercuryTourUtils{
	
	@Given("^initiate the browser$")
	public void initiate_the_browser() throws Throwable {
		System.out.println("Test pass...");
		initiateBrowser();
	}
	
	@Then("^enter username and password and click login button$")
	public void enter_username_and_password_and_click_login_button() throws Throwable {
		isElementPresentVerifyClick(XpathConstants.LOGIN_CLICK);
		Thread.sleep(2000);
		clearAndEnterText(XpathConstants.LOGIN_USERNAME_INPUT, "suresh.rmm@gmail.com");
		clearAndEnterText(XpathConstants.LOGIN_PASSWORD_INPUT, "Suresh@123");
		isElementPresentVerifyClick(XpathConstants.LOGIN_SUBMIT_BTN);
	}
}
