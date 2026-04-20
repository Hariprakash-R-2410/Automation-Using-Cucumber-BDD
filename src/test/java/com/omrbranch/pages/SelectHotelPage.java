package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);	
		}
	
   public static String txtSecondName;
   public static String txtSecondPrize;
   public static String txtLastName;
   public static String txtLastPrize;
   public static String txtFirstName;
   public static String txtFirstPrize;
   
   
   
   @FindBy(xpath = "//a[@id='clearsort']")
   private WebElement btnClear;
   
   @FindBy(xpath = "//label[@for='Standard']")
  private WebElement btnStandard;
	
	public WebElement getBtnClear() {
	return btnClear;
}

public WebElement getBtnStandard() {
	return btnStandard;
}

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement textSelectHotel;
	
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//h5")
	private  List<WebElement> lstHotelName; 
	
	@FindBy(xpath = "//div[@class='prize']//h2")
	private List<WebElement> lstHotelPrice;
	
	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement radiobtnPriceLowToHigh;
	
	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement radiobtnPriceHighToLow;
	
	@FindBy(xpath = "//label[@for='value_nasc']")
	private WebElement radiobtnHotelNameAscending;
	
	@FindBy(xpath = "//label[@for='value_ndesc']")
	private WebElement radiobtnHotelNameDescending;
	
	@FindBy(xpath = "//a[@class='btn filter_btn']")
	private List<WebElement> lstbtnContinue;
	
	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement verifyHeaderOfAllRoomType;
	
	


	public WebElement getVerifyHeaderOfAllRoomType() {
		return verifyHeaderOfAllRoomType;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public List<WebElement> getLstHotelName() {
		return lstHotelName;
	}

	public List<WebElement> getLstHotelPrice() {
		return lstHotelPrice;
	}

	public WebElement getRadiobtnPriceLowToHigh() {
		return radiobtnPriceLowToHigh;
	}

	public WebElement getRadiobtnPriceHighToLow() {
		return radiobtnPriceHighToLow;
	}

	public WebElement getRadiobtnHotelNameAscending() {
		return radiobtnHotelNameAscending;
	}

	public WebElement getRadiobtnHotelNameDescending() {
		return radiobtnHotelNameDescending;
	}

	public List<WebElement> getLstbtnContinue() {
		return lstbtnContinue;
	}
	//Then User should verify after search hotel success message "Select Hotel"
	public String searchHotelSuccessMessageText() {
		String searchHotelSuccessMessage = elementGetText(textSelectHotel);
		return searchHotelSuccessMessage;
	}
	
	// When User click sort from low to high
	public void getPriceLowToHigh() {
		elementClick(radiobtnPriceLowToHigh);

	}
	public void getNameHighToLow() {
		elementClick(radiobtnHotelNameDescending);
		
	}
	public boolean getHotelPriceLowToHigh() throws InterruptedException {
		Thread.sleep(3000);
		List<Integer>dev=new ArrayList<Integer>();
		List<Integer>qa=new ArrayList<Integer>();
		for (WebElement x : lstHotelPrice) {
			String text = x.getText();
			String replaceAll = text.replace("$","").replace(",","").trim();
	        int int1 = Integer.parseInt(replaceAll);
	        dev.add(int1);
	        }
		qa.addAll(dev);
		Collections.sort(qa);
		System.out.println(qa);
		return (qa.equals(dev)) ? true: false;
	}
	public boolean verifyHotelNameListDescending() throws InterruptedException {
		Thread.sleep(3000);
		List<String> dev=new ArrayList<String>();
		List<String> qa=new ArrayList<String>();
		for (WebElement x : lstHotelName) {
			String text = x.getText();
			dev.add(text);
			
			
		}
		qa.addAll(dev);
		Collections.sort(qa);
		Collections.reverse(qa);
		System.out.println(qa);
		
		return (qa.equals(dev))? true:false;
		
		
		
		
		
	}
	public boolean verifyHeaderContainsRoomType(String roomType) {
		String elementGetText = elementGetText(verifyHeaderOfAllRoomType);
		boolean contains = elementGetText.contains(roomType);
		return contains;
		
	}
	public void clickClearButton() throws InterruptedException {
		elementClick(btnClear);
		Thread.sleep(3000);
	}
	public void clickStandardbtn() {
		elementClick(btnStandard);
	}
	
	
	
    public boolean verifyOnlyStandardHotelsAreShown() throws InterruptedException  {
    	Thread.sleep(3000);
    	List<String> booleans=new ArrayList<String>();
		for (WebElement webElement : lstHotelName) {
			String text = webElement.getText();
		  boolean value = text.endsWith("Standard");
			String valueOf = String.valueOf(value);
			booleans.add(valueOf);
			
		}
		//return (booleans.contains(false)) ? true:false;
		if (booleans.contains(false)) {
			return false;
		}else {
			return true;
			
		}
		
	}
    public void selectSecondHotelNameandPrice() {
		WebElement SecondName = lstHotelName.get(1);
		 txtSecondName = SecondName.getText();
		
		WebElement SecondPrize = lstHotelPrice.get(1);
		 txtSecondPrize = SecondPrize.getText();
		
		
		
	}
    public void clickSecondHotel() throws InterruptedException {
		WebElement btnContinueSecond = lstbtnContinue.get(1);
		elementClick(btnContinueSecond);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
    	
	}
    public void selectLastHotelNameandPrize() {
    	
		int size = lstHotelName.size();
		WebElement webElement = lstHotelName.get(size-1);
		String txtLastName = webElement.getText();
		int size2 = lstHotelPrice.size();
		WebElement webElement2 = lstHotelPrice.get(size2-1);
		String txtLastPrize = webElement2.getText();
	}
    public void clickLastHotel() throws InterruptedException {
	   int size = lstbtnContinue.size();
	   WebElement webElement = lstbtnContinue.get(size-1);
	   elementClick(webElement);
	   Thread.sleep(3000);
	   driver.switchTo().alert().accept();
}
    public void selectFirstHotel() {
		WebElement webElement = lstHotelName.get(0);
		String txtFirstName = webElement.getText();
	    WebElement webElement2 = lstHotelPrice.get(0);
	    String txtFirstPrize = webElement2.getText();
    }
    public void clickFirstHotel() throws InterruptedException {
		WebElement webElement = lstbtnContinue.get(0);
		elementClick(webElement);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
    	
	}
    

	public static String getTxtSecondName() {
		return txtSecondName;
	}

	public static String getTxtSecondPrize() {
		return txtSecondPrize;
	}

	public static String getTxtLastName() {
		return txtLastName;
	}

	public static String getTxtLastPrize() {
		return txtLastPrize;
	}

	public static String getTxtFirstName() {
		return txtFirstName;
	}

	public static String getTxtFirstPrize() {
		return txtFirstPrize;
	}
	
}
