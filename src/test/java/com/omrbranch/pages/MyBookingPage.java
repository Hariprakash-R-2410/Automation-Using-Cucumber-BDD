package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBookingPage {
	@FindBy(xpath = "//a[@class='dropdown-item padding_manage acc_anchor border-bottom ']")
	private  WebElement btnMyBookings;
	
	@FindBy(xpath = "//input[@class='form-control w-50 d-inline-block']")
	private WebElement txtSearchProductId;
	
	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private WebElement btnEdit;
	
	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	
	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private WebElement btnConfirm;
	
	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement txtSuccessfullyBooked;
	
	@FindBy(xpath = "(//a[@class='cancle btn filter_btn'])[1]")
	private WebElement btnCancel;
	
	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement txtcCancelledSuccessfully;
	
	@FindBy(xpath = "//input[@class='form-control w-50 d-inline-block']")
	private WebElement txtSearchProductIdDisplayed;
	
	@FindBy(xpath = "//button[@class='cancle btn filter_btn mb-3']")
	private WebElement txtBtnCancelled;
	
	
	

}
