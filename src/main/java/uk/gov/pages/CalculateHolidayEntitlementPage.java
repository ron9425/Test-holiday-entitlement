package uk.gov.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;


public class CalculateHolidayEntitlementPage extends Utility {
    private static final Logger log = LogManager.getLogger(CalculateHolidayEntitlementPage.class.getName());

    public CalculateHolidayEntitlementPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement accept;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement start;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement daysWorked ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement year;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue2;


    @CacheLookup
    @FindBy(xpath = "//input[@id='response']")
    WebElement enterDays ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue3;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement hoursWorked;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement fullYearLeave;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response']")
    WebElement enterHours;

//    @CacheLookup
//    @FindBy(xpath = "")
//    WebElement ;



    public void clickOnAcceptCookies() {
        clickOnElement(accept);
        log.info("Clicking on Accept Cookies : " + accept.toString());
    }

    public void clickOnStartButton() {
        clickOnElement(start);
        log.info("Clicking on Start Button : " + start.toString());
    }

    public void clickOnDaysWorkedPerWeek() {
        clickOnElement(daysWorked);
        clickOnElement(continue1);
        log.info("Clicking on Days Worked Per Week : " + daysWorked.toString());
    }

    public void clickOnFullLeaveYear() {
        clickOnElement(year);
        clickOnElement(continue2);
        log.info("Clicking on Full Leave Year : " + year.toString());
    }

    public void enterDaysWorkedPerWeek() {
       sendTextToElement(enterDays,"5");
        clickOnElement(continue3);
        log.info("Clicking on Enter Days Worked Per Week : " +enterDays .toString());
    }


    public void clickOnHoursWorked() {
        clickOnElement(hoursWorked);
        clickOnElement(continue1);
        log.info("Clicking on Hours Worked  : " + hoursWorked.toString());
    }

    public void clickOnLeaveForYear() {
        clickOnElement(fullYearLeave);
        clickOnElement(continue2);
        log.info("Clicking on Full Leave Year : " + fullYearLeave.toString());
    }

    public void enterHoursWorkedPerWeek() {
        sendTextToElement(enterHours,"40");
        clickOnElement(continue3);
        log.info("Clicking on Hours Worked Per Week  : " + enterHours.toString());
    }

//    public void clickOn() {
//        clickOnElement();
//        log.info("Clicking on  : " + .toString());
//    }
//    public void clickOn() {
//        clickOnElement();
//        log.info("Clicking on  : " + .toString());
//    }






}
