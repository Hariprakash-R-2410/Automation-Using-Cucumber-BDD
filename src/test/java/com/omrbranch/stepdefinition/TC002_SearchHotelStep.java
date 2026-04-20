package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_SearchHotelStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String state  , String city, String roomType, String checkIn, String checkOut, String noOfRoom, String noOfAdults, String noOfChilds) {
	   pom.getSearchHotelPage().selectHotelsWithAllFields(state, city, roomType, checkIn, checkOut, noOfRoom, noOfAdults, noOfChilds);
		
	}
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expLoginSuccessMessageText) {
		String acttextSuccesMessageSelectHotel = pom.getSelectHotelPage().searchHotelSuccessMessageText();
		Assert.assertEquals("Verify Select Hotel",expLoginSuccessMessageText,acttextSuccesMessageSelectHotel );
  	
	}
	
	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String state, String city, String checkIn, String checkOut, String noOfRoom, String noOfAdults) {
	   pom.getSearchHotelPage().selectHotelsWithOnlyMandatoryFields(state, city, checkIn, checkOut, noOfRoom, noOfAdults);
	   
	}	
	

	@Then("User click Search button")
	public void userClickSearchButton() {
	    pom.getSearchHotelPage().userClickOnSelectButton();
	
	}
	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String expErrorTextMsgState, String expErrorTextMsgCity, String expErrorTextMsgCheckIn, String expErrorTextMsgCheckOut, String expErrorTextMsgNumberOfRooms, String expErrorTextMsgNumberOfAdults) {
	   String acterrorTextMsgState = pom.getSearchHotelPage().getErrorTextMsgState();
	   Assert.assertEquals("Verify error message of State", expErrorTextMsgState,acterrorTextMsgState);
	   
	   String acterrorTextMsgCity = pom.getSearchHotelPage().getErrorTextMsgCity();
       Assert.assertEquals("Verify error message of City",expErrorTextMsgCity,acterrorTextMsgCity );	
       
       String acterrorTextMsgCheckIn = pom.getSearchHotelPage().getErrorTextMsgCheckIn();
       Assert.assertEquals("Verify error message of CheckIn", expErrorTextMsgCheckIn,acterrorTextMsgCheckIn);
       
       String acterrorTextMsgCheckOut = pom.getSearchHotelPage().getErrorTextMsgCheckOut();
       Assert.assertEquals("Verify error message of CheckOut", expErrorTextMsgCheckOut,acterrorTextMsgCheckOut);
       
	   String acterrorMsgNumberofRooms = pom.getSearchHotelPage().getErrorMsgNumberofRooms();
       Assert.assertEquals("Verify error message of Number Of Rooms", expErrorTextMsgNumberOfRooms,acterrorMsgNumberofRooms);
       
       String acterrorTextMsgNumberOfAdults = pom.getSearchHotelPage().getErrorTextMsgNumberOfAdults();
       Assert.assertEquals("Verify error message of Number Of Adults",expErrorTextMsgNumberOfAdults,acterrorTextMsgNumberOfAdults );
	}

	
	@When("User click sort from low to high")
	public void userClickSortFromLowToHigh() {
		pom.getSelectHotelPage().getPriceLowToHigh();
		
		
	   
	}
	@Then("User should verify after sorting that price are listed from low to high")
	public void userShouldVerifyAfterSortingThatPriceAreListedFromLowToHigh() throws InterruptedException {
	   boolean acthotelPriceLowToHigh = pom.getSelectHotelPage().getHotelPriceLowToHigh();
	   Assert.assertTrue("Verify whether it is from low to high",acthotelPriceLowToHigh);
	
	}
	
	@When("User click sort from Descending order")
	public void userClickSortFromDescendingOrder() {
		pom.getSelectHotelPage().getNameHighToLow();
	    
	
	}
	@Then("User should verify after sorting that name in Descending order")
	public void userShouldVerifyAfterSortingThatNameInDescendingOrder() throws InterruptedException {
	    boolean actverifyHotelNameListDescending = pom.getSelectHotelPage().verifyHotelNameListDescending();
	  Assert.assertTrue(actverifyHotelNameListDescending);
	}


	

	@Then("User should verify the header contains {string}")
	public void userShouldVerifyTheHeaderContains(String roomType) {
	   boolean contains = pom.getSelectHotelPage().verifyHeaderContainsRoomType(roomType);	
	   Assert.assertTrue("Verify Header Message of Roomtype",contains);
	}

	
	@When("User click Standard room type")
	public void userClickStandardRoomType() throws InterruptedException {
		pom.getSelectHotelPage().clickClearButton();
		pom.getSelectHotelPage().clickStandardbtn();
	}
	
	@Then("User should verify after sorting that Standard room type is listed")
	public void userShouldVerifyAfterSortingThatStandardRoomTypeIsListed() throws InterruptedException {
		boolean verifyOnlyStandardHotelsAreShown = pom.getSelectHotelPage().verifyOnlyStandardHotelsAreShown();
	    Assert.assertTrue(verifyOnlyStandardHotelsAreShown);
	
	}










	

}
