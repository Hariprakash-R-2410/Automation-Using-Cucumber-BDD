package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStep extends BaseClass {
     PageObjectManager pom=new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		
	  	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
		pom.getLoginPage().login(userName, password);
		
	   
	
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginSuccessMessageText) {
	   	String actloginSuccessMessageText = pom.getSearchHotelPage().getLoginSuccessMessageText();
	Assert.assertEquals("Verify After login success message", expLoginSuccessMessageText,actloginSuccessMessageText);
	
	}
	@When("User login {string} and {string} with enter key")
	public void userLoginAndWithEnterKey(String userName, String password) {
		pom.getLoginPage().loginWithEnterKey(userName, password);
	   
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expLoginErrorMessageText) {
		String actloginErrorMessageText = pom.getLoginPage().getLoginErrorMessageText();
		boolean contains = actloginErrorMessageText.contains(expLoginErrorMessageText);
		Assert.assertTrue("Verify error message",contains);
		    
		
		
	}
		
	





	
	
	
	
	
	
	
}
