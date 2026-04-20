package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
public SearchHotelPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	
	  @FindBy(xpath = "//a[@class='icoTwitter mr-2 dropdown-toggle']")
	  private WebElement textSuccessMessageWelcome;
	  
	  
	  @FindBy(id = "state")
	  private WebElement txtState;
	  
	  @FindBy(id = "city")
	  private WebElement txtCity;
	  
	  public WebElement getTextSuccessMessageWelcome() {
		return textSuccessMessageWelcome;
	}



	@FindBy(id = "room_type")
	  private WebElement txtRoomType;
	  
	  @FindBy(name = "check_in")
	  private WebElement txtcheckin;

	  @FindBy(name = "check_out")
	  private WebElement txtCheckout;

	  @FindBy(id = "no_rooms")
	  private WebElement txtNumberofRooms;

	  @FindBy(id = "no_adults")
	  private WebElement txtNumberofAdults;

	  @FindBy(id = "no_child")
	  private WebElement txtNumberofChildren;
	  
	  @FindBy(id = "hotelsearch_iframe")
	  private WebElement frameId;
	  
	  public WebElement getFrameId() {
		return frameId;
	}



	@FindBy(id = "searchBtn")
	  private WebElement btnSearch;
	 
	@FindBy(id = "invalid-state")
	  private WebElement textErrorMessageState;
	  
	  @FindBy(id = "invalid-city")
	  private WebElement textErrorMessageCity;
	  
	  @FindBy(id = "invalid-check_in")
	  private WebElement textErrorMessageCheckin;
	  
	  @FindBy(id = "invalid-check_out")
	  private WebElement textErrorMessageCheckout;
	  
	  @FindBy(id = "invalid-no_rooms")
	  private WebElement textErrorMessageNumberofRooms;

	  @FindBy(id = "invalid-no_adults")
	  private WebElement textErrorMessageNumberofAdults;

	  

	  public WebElement getTextSuccessMessageWelcom() {
		return textSuccessMessageWelcome;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtcheckin() {
		return txtcheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getTxtNumberofRooms() {
		return txtNumberofRooms;
	}

	public WebElement getTxtNumberofAdults() {
		return txtNumberofAdults;
	}

	public WebElement getTxtNumberofChildren() {
		return txtNumberofChildren;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTextErrorMessageState() {
		return textErrorMessageState;
	}

	public WebElement getTextErrorMessageCity() {
		return textErrorMessageCity;
	}

	public WebElement getTextErrorMessageCheckin() {
		return textErrorMessageCheckin;
	}

	public WebElement getTextErrorMessageCheckout() {
		return textErrorMessageCheckout;
	}

	public WebElement getTextErrorMessageNumberofRooms() {
		return textErrorMessageNumberofRooms;
	}

	public WebElement getTextErrorMessageNumberofAdults() {
		return textErrorMessageNumberofAdults;
	}

	
	

	  
	public String getLoginSuccessMessageText() {
		String elementGetText = elementGetText(textSuccessMessageWelcome);
		return elementGetText;
	
	}
	public void SelectRoomType(String roomType) {
		String[] x = roomType.split("/");
	for (String e : x) {
		selectOptionByText(txtRoomType,e);
	}
	
	}
	public void selectHotelsWithAllFields(String state,String city,String roomType,String checkIn,String checkOut,String noOfRoom,String noOfAdults,String noOfChildren) {
		selectOptionByText(txtState, state);
		selectOptionByText(txtCity, city);
		SelectRoomType(roomType);
		elementSendKeysJs(txtcheckin, checkIn);
		elementSendKeysJs(txtCheckout, checkOut);
		selectOptionByText(txtNumberofRooms, noOfRoom);
		selectOptionByText(txtNumberofAdults, noOfAdults);
		elementSendKeys(txtNumberofChildren, noOfChildren);
	driver.switchTo().frame(frameId);
	elementClick(btnSearch);
	driver.switchTo().defaultContent();
	}
	
	public String getErrorTextMsgState() {
		String errorTextMsgState = elementGetText(textErrorMessageState);
		return errorTextMsgState;
	}
	public String getErrorTextMsgCity() {
		String errorTextMsgCity = elementGetText(textErrorMessageCity);
		return errorTextMsgCity;
	}
	public String getErrorTextMsgCheckIn() {
		String errorTextMsgCheckIn = elementGetText(textErrorMessageCheckin);
		return errorTextMsgCheckIn;
	
	}
	public String getErrorTextMsgCheckOut() {
		String errorTextMsgCheckOut = elementGetText(textErrorMessageCheckout);
		return errorTextMsgCheckOut;
		
	}
	public String getErrorMsgNumberofRooms() {
		String errorTextMsgNumberOfRooms = elementGetText(textErrorMessageNumberofRooms);
		return errorTextMsgNumberOfRooms;
		
	}
	public String getErrorTextMsgNumberOfAdults() {
		String errorTextMsgNumberOfAdults = elementGetText(textErrorMessageNumberofAdults);
		return errorTextMsgNumberOfAdults;
	}
	public void selectHotelsWithOnlyMandatoryFields(String state,String city,String checkIn,String checkOut,String noOfRoom,String noOfAdults) {
		selectOptionByText(txtState, state);
		selectOptionByText(txtCity, city);
		elementSendKeysJs(txtcheckin, checkIn);
		elementSendKeysJs(txtCheckout, checkOut);
		selectOptionByText(txtNumberofRooms, noOfRoom);
		selectOptionByText(txtNumberofAdults, noOfAdults);
		driver.switchTo().frame(frameId);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();
	}
	public void userClickOnSelectButton() {
		driver.switchTo().frame(frameId);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();

	}
		
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

