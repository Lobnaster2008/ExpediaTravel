package com.e2etests.automation.step_definitions;

import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.page_objects.FlightSearchPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchStepDefinition {
	
	private  FlightSearchPage flightSearchPage ;
	
	public FlightSearchStepDefinition() {
		this.flightSearchPage = new FlightSearchPage();
	}
	
	@Given("I want to get the url website")
	public void iWantToGetTheUrlWebsite() {
		flightSearchPage.goToUrl();
	}
	@When("I fill the goingto field with {string}")
	public void iFillTheGoingtoFieldWith(String destination) {
		
		//flightSearchPage.clickOnButton(flightSearchPage.goingTo);
		flightSearchPage.fillInput(flightSearchPage.goingTosc,destination);
		
	}
	@When("I select check-in date an check-out date from calender")
	public void iSelectCheckInDate() {
		flightSearchPage.clickOnButton(flightSearchPage.calender);
		flightSearchPage.clickOnButton(flightSearchPage.checkIn);
		flightSearchPage.clickOnButton(flightSearchPage.checkOut);
	}
	
	@When("I click on the button done")
	public void iClickOnTheButtonDone() {
		//flightSearchPage.clickOnButton(flightSearchPage.done);
	}
	@When("I click on the button search")
	public void iClickOnTheButtonSearch() {
		flightSearchPage.clickOnButton(flightSearchPage.done);
	}
	@Then("I check a new label is displayed contain {string}")
	public void iCheckANewLabelIsDisplayedContain(String string) {
		flightSearchPage.clickOnButton(flightSearchPage.search);
	}




}
