package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass{
    public LoginPage() {
	PageFactory.initElements(driver, this);	
    }  
	
	
	
		@FindBy(id = "email")
		private WebElement txtemail;
	
	    @FindBy(id = "pass")
	    private WebElement txtPass;
	
	   @FindBy(xpath = "//button[@value='login']")
	   private WebElement btnLogin;
	
	   @FindBy(xpath = "//div[@id='errorMessage']")
	   private WebElement textErrormessageLogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTextErrormessageLogin() {
		return textErrormessageLogin;
	}
	public void login(String userName,String password) {
		elementSendKeys(txtemail, userName);
		elementSendKeys(txtPass, password);
		elementClick(btnLogin);
		
	  
}
	public void loginWithEnterKey(String userName,String password) {
		elementSendKeys(txtemail,userName );
		elementSendKeysandEnter(txtPass, password);
	}
	
	
	public String getLoginErrorMessageText() {
		String elementGetText = elementGetText(textErrormessageLogin);
		return elementGetText;
		
	}
	
	
}
