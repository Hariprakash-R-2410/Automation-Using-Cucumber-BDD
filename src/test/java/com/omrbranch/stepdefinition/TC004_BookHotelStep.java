package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.objectmanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC004_BookHotelStep {
PageObjectManager pom= new PageObjectManager();
	
	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void userAddGuestDetailsAnd(String salutation, String firstName, String string3lastName, String mobile, String email) {
	    pom.getBookHotelPage().guestDetails(salutation, firstName, string3lastName, mobile, email);
	    
	    
	
	}
	@When("User add GST Details {string},{string} and {string}")
	public void userAddGSTDetailsAnd(String gstNumber, String companyName, String companyAddress) {
	   pom.getBookHotelPage().gstDetails(gstNumber, companyName, companyAddress);
	
	}
	@When("User add Special Request {string}")
	public void userAddSpecialRequest(String otherRequest) {
	    pom.getBookHotelPage().addSpecialRequest(otherRequest);
	
	}
	@When("User enter payment details, procced with Card Type {string}")
	public void userEnterPaymentDetailsProccedWithCardType(String debitCard, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		pom.getBookHotelPage().twoWithHeader(debitCard, dataTable);
		

				
		
	}
	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void userShouldVerifyAfterHotelBookingSuccessMessageAndSaveTheOrderID(String ExpBookingisConfirmedMsg) {
		String actbookingIsConfirmedTextMsg = pom.getBookingConfirmationPage().getBookingIsConfirmedTextMsg();
	   Assert.assertEquals("Verify Booking is confirmed", ExpBookingisConfirmedMsg,actbookingIsConfirmedTextMsg);
	    
	
	}
	@Then("User should verify same selected Hotel is booked or not")
	public void userShouldVerifySameSelectedHotelIsBookedOrNot() {
	   boolean verifySameHotelisSelected = pom.getBookingConfirmationPage().verifySameHotelisSelected();
	  Assert.assertTrue("Verify Same hotel selected or not",verifySameHotelisSelected);
	  
	}
	
	@When("User doesnot add any special request")
	public void userDoesnotAddAnySpecialRequest() {
	  pom.getBookHotelPage().doesnotAddAnySpecialRequest();
		
		
		
	}
		@When("User doesnot add Gst Details")
		public void userDoesnotAddGstDetails() {
		    pom.getBookHotelPage().doesnotGiveGstDetails();
			
			
			
		}
		
		@When("User doesnot add Gst and SpecialRequest")
		public void userDoesnotAddGstAndSpecialRequest() {
		    pom.getBookHotelPage().doesnotAddBothGstandSpecialRequest();
			
		}
	@When("User click credit card")
	public void userClickCreditCard() {
			pom.getBookHotelPage().onlyClickCreditCardButton();
	    
		
		
		}
	@When("User click submit without enetring payment details")
	public void userClickSubmitWithoutEnetringPaymentDetails() {
	   pom.getBookHotelPage().onlyClickSubmitButton();
	
	}
	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessageAnd(String expCardTypeErrorMessage, String expCardErrorMessage, String expCardNumberMessage, String expCardNameErrorMessage, String expCardMonthErrorMessage, String expCardCvvErrorMessage) {
		   String actCardTypeErrorMessage = pom.getBookHotelPage().getCardTypeErrorMessage();
		   Assert.assertEquals("Verify Card Type Error Message", expCardTypeErrorMessage, actCardTypeErrorMessage );
		   
		  String actCardErrorMessage = pom.getBookHotelPage().getCardErrorMessage();
		  Assert.assertEquals("Verify card Error message",actCardErrorMessage, expCardErrorMessage  );
		  
		  String actCardNumberErrorMessage = pom.getBookHotelPage().getCardNumberErrorMessage();
		  Assert.assertEquals("Verify Card number error message", actCardNumberErrorMessage, expCardNumberMessage );
		  
		  String actCardNameErrorMessage = pom.getBookHotelPage().getCardNameErrorMessage();
		  Assert.assertEquals("Verify Card name error message", expCardNameErrorMessage, actCardNameErrorMessage);
		  
		  String actCardMonthErrorMessage = pom.getBookHotelPage().getCardMonthErrorMessage();
		  Assert.assertEquals("Verify card month error message", expCardMonthErrorMessage, actCardMonthErrorMessage);
		  
		  String actCardCvvErrorMessage = pom.getBookHotelPage().getCardCvvErrorMessage();
		  Assert.assertEquals("Verify card CVV error message", expCardCvvErrorMessage, actCardCvvErrorMessage );
		  
		}
		@When("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsAndClickSubmit(String upiId) throws InterruptedException {
	   pom.getBookHotelPage().enterUpiDetailsAndClickSubmit(upiId);
		
		}
		
		@When("User click upi")
		public void userClickUpi() throws InterruptedException {
			 pom.getBookHotelPage().clickUpi();
				
			
		}
		@Then("User should verify after payment details error message {string}")
		public void userShouldVerifyAfterPaymentDetailsErrorMessage(String expCvvErrorMessage) {
			String actUpiErrorMessage = pom.getBookHotelPage().upiErrorMessage();
			Assert.assertEquals("Verify Upi error message", expCvvErrorMessage, actUpiErrorMessage );
			
		}






	
	
	



}





	
	
	
	
	

