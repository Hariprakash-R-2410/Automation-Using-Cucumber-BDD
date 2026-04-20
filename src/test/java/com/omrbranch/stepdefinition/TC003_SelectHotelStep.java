package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC003_SelectHotelStep {
	PageObjectManager pom=new PageObjectManager();
	
	
	@When("User save the Second hotel name and hotel price")
	public void userSaveTheSecondHotelNameAndHotelPrice() {
		pom.getSelectHotelPage().selectSecondHotelNameandPrice();
	    
	
	}
	@When("User select the Select Second hotel and accept the alert")
	public void userSelectTheSelectSecondHotelAndAcceptTheAlert() throws InterruptedException {
	pom.getSelectHotelPage().clickSecondHotel();   
	
	}
	@Then("User should verify after select success message {string}")
	public void userShouldVerifyAfterSelectSuccessMessage(String expselectHotelSuccesMsg) {
	    String actselectHotelSuccesMsg = pom.getBookHotelPage().getSelectHotelSuccesMsg();
	    boolean contains = actselectHotelSuccesMsg.contains(expselectHotelSuccesMsg);
		Assert.assertTrue("Verify Select Hotel",contains);
		
	}
	
	
	
	@When("User save the last hotel name and hotel price")
	public void userSaveTheLastHotelNameAndHotelPrice() {
		pom.getSelectHotelPage().selectLastHotelNameandPrize();
	   
		
		
	}
	@When("User select the last hotel and accept the alert")
	public void userSelectTheLastHotelAndAcceptTheAlert() throws InterruptedException {
	   pom.getSelectHotelPage().clickLastHotel();
	
	
	}
	
	@When("User save the first hotel name and hotel price")
	public void userSaveTheFirstHotelNameAndHotelPrice() {
	    pom.getSelectHotelPage().selectFirstHotel();
	
	}
	@When("User select the first hotel and dismiss the alert")
	public void userSelectTheFirstHotelAndDismissTheAlert() throws InterruptedException {
	   pom.getSelectHotelPage().clickFirstHotel();
	   	
	
	}
	
	@Then("User should verify after Search success message {string}")
	public void userShouldVerifyAfterSearchSuccessMessage(String expSearchSuccessMessage) {
	    String actsearchHotelSuccessMessageText = pom.getSelectHotelPage().searchHotelSuccessMessageText();
	Assert.assertEquals("Verify Search Message", expSearchSuccessMessage,actsearchHotelSuccessMessageText);
	
	
	}










	
	
	
	

}
