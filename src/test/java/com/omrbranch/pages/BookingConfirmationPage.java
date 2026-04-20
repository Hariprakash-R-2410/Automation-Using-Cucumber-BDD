package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage  extends BaseClass {
	public BookingConfirmationPage() {
	PageFactory.initElements(driver, this);	
	}
	public static String ProductId;

	@FindBy(name = "booking-code")
	private WebElement txtProductId;
	
	@FindBy(xpath = "//p[contains(text(),'Hotel')]//strong")
	private WebElement txtHotelNamedisplayed;
	
	@FindBy(xpath = "//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement btnWelcomeUserName;

	public static String getProductId() {
		return ProductId;
	}

	public WebElement getTxtProductId() {
		return txtProductId;
	}

	public WebElement getTxtHotelNamedisplayed() {
		return txtHotelNamedisplayed;
	}

	public WebElement getBtnWelcomeUserName() {
		return btnWelcomeUserName;
	}
	public String getBookingIsConfirmedTextMsg() {
		 String elementGetText = elementGetText(txtProductId);
		 String[] split = elementGetText.split(" ");
		 String bookingString=split[1]+ " "+split[2]+" "+split[3];
		System.out.println(bookingString);
		 return bookingString;
		    
	}
	public String saveOrderId() {
		String elementGetText = elementGetText(txtProductId);
		String ProductId = elementGetText.split(" ")[0].substring(1);
		System.out.println(ProductId);
		return ProductId;
		
		
		
	}
	public String hotelNameDisplayed() {
		String Hotelname = elementGetText(txtHotelNamedisplayed);
		System.out.println(Hotelname);
		return Hotelname;
		
	}
	
//	public void bookingConfirmedMsg() {
//		String elementGetText = elementGetText(txtProductId);
//		elementGetText.substring(12);
//		elementGetText.substring(1, 10);
//	}
//		
		
		
	
	public boolean verifySameHotelisSelected() {
		boolean contains = SelectHotelPage.txtSecondName.contains(elementGetText(txtHotelNamedisplayed));
		return contains;
	   

	}

	
	
	
	
	
	
}
