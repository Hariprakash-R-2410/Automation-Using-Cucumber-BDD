package com.omrbranch.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	Select select;
	Actions actions;

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\config\\config.properties"));

		Object object = properties.get(key);
		String value = (String) object;
		return value;

	}

	public void dragAndDrop(WebElement source, WebElement dest) {
		visibilityOfElement(source);
		visibilityOfElement(dest);
		if (elementIsDisplayed(source) && elementIsDisplayed(dest)) {
			actions = new Actions(driver);
			actions.dragAndDrop(source, dest).perform();
		}
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void getAllDropDownOptions(WebElement element) {
		visibilityOfElement(element);
		List<String> res = new ArrayList<>();

		select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			res.add(webElement.getText());

		}

	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));

	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	public static void browserLaunch(String browserType) {
		switch (browserType) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public static void enterApplnUrl(String url) {
		driver.get(url);

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.sendKeys(data);
		}
	}

	public void elementSendKeysandEnter(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.sendKeys(data, Keys.ENTER);
		}
	}

	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String exp) {
		WebElement element = driver.findElement(By.xpath(exp));
		return element;
	}

	public String getApplnCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public boolean elementIsSelected(WebElement element) {
		visibilityOfElement(element);
		boolean selected = element.isSelected();
		return selected;
	}

	public boolean elementIsEnabled(WebElement element) {
		visibilityOfElement(element);
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean elementIsDisplayed(WebElement element) {
		visibilityOfElement(element);
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public String elementGetText(WebElement element) {
		visibilityOfElement(element);
		String text = null;
		if (elementIsDisplayed(element)) {
			text = element.getText();
		}
		return text;
	}

	public String elementGetAttributeValue(WebElement element) {
		visibilityOfElement(element);
		String attribute = null;
		if (elementIsDisplayed(element)) {
			attribute = element.getAttribute("value");
		}
		return attribute;
	}

	public String elementGetAttributeValue(WebElement element, String attributeName) {
		visibilityOfElement(element);
		String attribute = null;
		if (elementIsDisplayed(element)) {
			attribute = element.getAttribute(attributeName);
		}
		return attribute;
	}

	public void selectOptionByText(WebElement element, String text) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {

			select = new Select(element);
			select.selectByVisibleText(text);
		}
	}

	public void selectOptionByValue(WebElement element, String value) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			select = new Select(element);
			select.selectByValue(value);
		}
	}

	public void selectOptionByIndex(WebElement element, int index) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element)) {
			select = new Select(element);
			select.selectByIndex(index);
		}
	}

	public byte[] takeScreenShot() {

			
				TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;

		
	}

}
