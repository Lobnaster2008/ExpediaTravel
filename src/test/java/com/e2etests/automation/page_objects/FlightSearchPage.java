package com.e2etests.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class FlightSearchPage {
	private static ConfigFileReader configFileReader;
	
	final static String GOINGTO = "//button[@aria-label='Going to']";
	final static String GOINGTOSC = "//input[@placeholder=\"Where are you going?\"]";
	
	//input[@id='location-field-destination']
	final static String CALENDER = "//button[@data-stid=\"open-date-picker\"]";
	final static String CHECKIN = "//button[@aria-label='Nov 1, 2022']";
	final static String CHECKOUT = "//button[@aria-label='Nov 18, 2022']";
	final static String DONE = "//button[@data-stid='apply-date-picker' and contains(text(),'Done')]";
	final static String SEARCH = "//button[@data-testid='submit-button' and contains(text(),'Search')] ";
	final static String AREA = "uitk-menu-container animation-disabled uitk-menu-open uitk-menu-pos-right uitk-menu-container-autoposition";
	
	/* @FindBy */
	@FindBy(how = How.XPATH, using = GOINGTOSC)
	public static WebElement goingTo;
	@FindBy(how = How.XPATH, using = CALENDER)
	public static WebElement calender;
	@FindBy(how = How.XPATH, using = GOINGTO)
	public static WebElement goingTosc;
	@FindBy(how = How.XPATH, using = CHECKIN)
	public static WebElement checkIn;
	@FindBy(how = How.XPATH, using = CHECKOUT)
	public static WebElement checkOut;
	@FindBy(how = How.XPATH, using = DONE)
	public static WebElement done;
	@FindBy(how = How.XPATH, using = SEARCH)
	public static WebElement search;
	
	
	public FlightSearchPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		JavascriptExecutor j = (JavascriptExecutor) Setup.getDriver();
      // identify element and set value
	   j.executeScript("document.querySelector(\"div[data-stid='header-menu-illustration']\").value='True';");
		
	
	}
	
	public void fillInput(WebElement e ,String value) {
		e.sendKeys(value);
	}
	public void clickOnButton(WebElement e) {
		e.click();
	}
}
