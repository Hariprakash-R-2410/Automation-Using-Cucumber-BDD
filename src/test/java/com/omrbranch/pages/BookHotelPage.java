package com.omrbranch.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass{
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		}
	
	
	
	
	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement txtSelectHotel;
	
	
	@FindBy(id="own")
	private WebElement btnMyself;
	
	@FindBy(id="user_title")
	private WebElement TxtMr;
	

	@FindBy(id="first_name")
	private WebElement txtFirstName;
	

	@FindBy(id="last_name")
	private WebElement txtLastName;
	

	@FindBy(id="user_phone")
	private WebElement txtPhoneNumber;
	

	@FindBy(id="user_email")
	private WebElement txtemailofUser;
	

	@FindBy(id="gst")
	private WebElement btnGst;
	

	@FindBy(id="gst_registration")
	private WebElement txtGstNumber;
	
	

	@FindBy(id="company_name")
	private WebElement txtCompanyName;
	

	@FindBy(id="company_address")
	private WebElement txtCompanyAddress;
	
	@FindBy(id="step1next")
	private WebElement btnNextButton1;


	@FindBy(id="late")
	private WebElement btnRadioCheckIn;
	
	@FindBy(id="other_request")
	private WebElement txtOtherrequest;
	
	@FindBy(id="step2next")
	private WebElement BtnNeedButton2;
    
    

	@FindBy(xpath = "//h5[text()='Credit/Debit/ATM Card']")
	private WebElement BtnCards;
    

	@FindBy(id="payment_type")
	private WebElement ddnSltCardType;
    

	public WebElement getTxtCardName() {
		return txtCardName;
	}




	@FindBy(id="card_type")
	private WebElement ddnSltCard;
	
	@FindBy(id="card_no")
	private WebElement txtCardNumber;
	
	@FindBy(id = "card_name")
	private WebElement txtCardName;
	
	@FindBy(id="card_month")
	private WebElement ddnSltCardMonth;
	
	@FindBy(id="card_year")
	private WebElement ddnSltCardYear;
	
	@FindBy(id="cvv")
	private WebElement txtCvv;
	
	@FindBy(id="submitBtn")
	private WebElement BtnSubmit;
	
	@FindBy(xpath = "//div[@id='invalid-payment_type']")
	private WebElement textErrorMessageCardType;
	
	@FindBy(xpath = "//div[@id='invalid-card_type']")
	private WebElement textErrorMessageCard;
	
	@FindBy(xpath = "//div[@id='invalid-card_no']")
	private WebElement textErrorMessageCardNo;
	
	@FindBy(xpath = "//div[@id='invalid-card_name']")
	private WebElement textErrorMessageCardName;
	
	@FindBy(xpath = "//div[@id='invalid-card_month']")
	private WebElement textErrorMessageCardMonth;
	
	@FindBy(xpath = "//div[@id='invalid-cvv']")
	private WebElement textErrorMessageCardCvv;
	
	@FindBy(xpath = "//div[@class='upi pm']")
	private WebElement btnUpiId;
	
	@FindBy(xpath = "//input[@id='upi_id']")
	private WebElement txtUpiId;
	
	@FindBy(xpath = "//div[@id='invalid-upi']")
	private WebElement errorMessageUpiId;

	


	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}

	public WebElement getBtnMyself() {
		return btnMyself;
	}

	public WebElement getTxtMr() {
		return TxtMr;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getTxtemailofUser() {
		return txtemailofUser;
	}

	public WebElement getBtnGst() {
		return btnGst;
	}

	public WebElement getTxtGstNumber() {
		return txtGstNumber;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnNextButton1() {
		return btnNextButton1;
	}

	public WebElement getBtnRadioCheckIn() {
		return btnRadioCheckIn;
	}

	public WebElement getTxtOtherrequest() {
		return txtOtherrequest;
	}

	public WebElement getBtnNeedButton2() {
		return BtnNeedButton2;
	}

	public WebElement getBtnCards() {
		return BtnCards;
	}

	public WebElement getDdnSltCardType() {
		return ddnSltCardType;
	}

	public WebElement getDdnSltCard() {
		return ddnSltCard;
	}

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getDdnSltCardMonth() {
		return ddnSltCardMonth;
	}

	public WebElement getTextErrorMessageCardType() {
		return textErrorMessageCardType;
	}

	public WebElement getTextErrorMessageCard() {
		return textErrorMessageCard;
	}

	public WebElement getTextErrorMessageCardNo() {
		return textErrorMessageCardNo;
	}

	public WebElement getTextErrorMessageCardName() {
		return textErrorMessageCardName;
	}

	public WebElement getTextErrorMessageCardMonth() {
		return textErrorMessageCardMonth;
	}

	public WebElement getTextErrorMessageCardCvv() {
		return textErrorMessageCardCvv;
	}

	public WebElement getBtnUpiId() {
		return btnUpiId;
	}

	public WebElement getTxtUpiId() {
		return txtUpiId;
	}

	public WebElement getErrorMessageUpiId() {
		return errorMessageUpiId;
	}

	public WebElement getDdnSltCardYear() {
		return ddnSltCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return BtnSubmit;
	}
	public String getSelectHotelSuccesMsg() {
		String text = txtSelectHotel.getText();
		String[] split = text.split("-");
		String needTxt=split[0];
		return needTxt;
		
	}
	public void guestDetails(String salutation,String firstName,String lastName,String mobile,String email) {
		elementClick(btnMyself);
		selectOptionByText(TxtMr, salutation);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lastName);
		elementSendKeys(txtPhoneNumber, mobile);
		elementSendKeys(txtemailofUser, email);
		
		
	}
	public void gstDetails(String gstNumber,String companyName,String companyAddress) {
		elementClick(btnGst);
		elementSendKeys(txtGstNumber, gstNumber);
		elementSendKeys(txtCompanyName, companyName);
		elementSendKeys(txtCompanyAddress, companyAddress);
	    elementClick(btnNextButton1);
	}
	public void addSpecialRequest(String otherRequest) {
		elementClick(btnRadioCheckIn);
		elementSendKeys(txtOtherrequest, otherRequest);
		elementClick(BtnNeedButton2);
	}
	public void twoWithHeader(String debitCard,DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
			String cardType = map.get("Select Card");
			String cardNo = map.get("Card No");
			String cardName = map.get("Card Name");
			String cardMonth = map.get("Month");
			String CardYear = map.get("Year");
		    String cardCvv = map.get("CVV");
		
		
		
		
		
		elementClick(BtnCards);
		Thread.sleep(2000);
		selectOptionByText(ddnSltCardType, debitCard);
		
		selectOptionByText(ddnSltCard,cardType);
		elementSendKeys(txtCardNumber, cardNo);
		elementSendKeys(txtCardName, cardName);
		selectOptionByText(ddnSltCardMonth, cardMonth);
		selectOptionByText(ddnSltCardYear, CardYear);
		elementSendKeys(txtCvv, cardCvv);
		elementClick(BtnSubmit);
		
		
//		List<Map<String, String>> asMaps = dataTable.asMaps();
//		Map<String, String> map = asMaps.get(0);
//		String SelectCard = map.get("Visa");
//		String  = map.get("5555555555552222");
//		
	}
	public void doesnotAddAnySpecialRequest() {
		elementClick(BtnNeedButton2);
	}
	public void doesnotGiveGstDetails() {
		elementClick(btnNextButton1);
	}
	public void doesnotAddBothGstandSpecialRequest() {
		elementClick(btnNextButton1);
		elementClick(BtnNeedButton2);
		
	}
	public void onlyClickCreditCardButton() {
		elementClick(BtnCards);	
		
		
		}
	public void onlyClickSubmitButton() {
			elementClick(BtnSubmit);
		}
	public String getCardTypeErrorMessage() {
		String errorCardTypeText = elementGetText(textErrorMessageCardType);
		return errorCardTypeText;
	}
	
	public String getCardErrorMessage() {
		String errorCardText = elementGetText(textErrorMessageCard);
		return errorCardText;
	}
	
	public String getCardNumberErrorMessage() {
		String errorCardNumberText = elementGetText(textErrorMessageCardNo);
		return errorCardNumberText;
	}
	
	public String getCardNameErrorMessage() {
		String errorCardNameText = elementGetText(textErrorMessageCardName);
		return errorCardNameText;
	}
	
	public String getCardMonthErrorMessage() {
		String errorCardMonthText = elementGetText(textErrorMessageCardMonth);
		return errorCardMonthText;
	}
	
	public String getCardCvvErrorMessage() {
		String errorCardCvvText = elementGetText(textErrorMessageCardCvv);
		return errorCardCvvText;
	}
	public void enterUpiDetailsAndClickSubmit(String upiId) throws InterruptedException {
		elementClick(btnUpiId);
		Thread.sleep(2000);	   
		elementSendKeys(txtUpiId, upiId);
		elementClick(BtnSubmit);
		
	}
	
	public void clickUpi() throws InterruptedException {
		elementClick(btnUpiId);
		Thread.sleep(2000);	   
	}
	
	public String upiErrorMessage() {
		String upiErrorText = elementGetText(errorMessageUpiId);
        return upiErrorText;
	}

	
	

}
