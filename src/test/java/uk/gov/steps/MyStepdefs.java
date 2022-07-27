package uk.gov.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.pages.CalculateHolidayEntitlementPage;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on Accept Cookies$")
    public void iClickOnAcceptCookies() {
        new CalculateHolidayEntitlementPage().clickOnAcceptCookies();
    }

    @Then("^I click on StartButton$")
    public void iClickOnStartButton() {
        new CalculateHolidayEntitlementPage().clickOnStartButton();
    }

    @And("^I click on Days Worked Per Week and click continue$")
    public void iClickOnDaysWorkedPerWeekAndClickContinue() {
        new CalculateHolidayEntitlementPage().clickOnDaysWorkedPerWeek();
    }

    @And("^I click on Full Leave Year and click continue$")
    public void iClickOnFullLeaveYearAndClickContinue() {
        new CalculateHolidayEntitlementPage().clickOnFullLeaveYear();
    }

    @And("^I Enter Days Worked Per Week and click continue$")
    public void iEnterDaysWorkedPerWeekAndClickContinue() {
        new CalculateHolidayEntitlementPage().enterDaysWorkedPerWeek();

    }

    @And("^The user should see the entitlement holidays$")
    public void theUserShouldSeeTheEntitlementHolidays() {
    }


    @And("^I click on Hours Worked Per Week and click continue$")
    public void iClickOnHoursWorkedPerWeekAndClickContinue() {
        new CalculateHolidayEntitlementPage().clickOnHoursWorked();
    }

    @And("^I click on Leave For Year and click continue$")
    public void iClickOnLeaveForYearAndClickContinue() {
        new CalculateHolidayEntitlementPage().clickOnLeaveForYear();
    }

    @And("^I Enter Hours Worked Per Week and click continue$")
    public void iEnterHoursWorkedPerWeekAndClickContinue() {
        new CalculateHolidayEntitlementPage().enterHoursWorkedPerWeek();
            }


}
