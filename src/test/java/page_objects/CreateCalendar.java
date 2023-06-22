package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateCalendar extends BasePage{

    @FindBy(xpath = "(//div[@class='v-moon v-moon3'])[2]")
    @CacheLookup
    WebElement overlay;

    @FindBy(id = "No-calendars-found-btn-positive-action")
    @CacheLookup
    WebElement createCalendarButton;

    @FindBy(xpath = "(//button[@id='save-contact-button'])[1]")
    @CacheLookup
    WebElement selectRoundRobin;

    @FindBy(xpath = "(//section[@class='section-team-members']//span//button)[1]")
    @CacheLookup
    WebElement addUserButton;

    @FindBy(xpath = "//input[@placeholder='Select User']")
    @CacheLookup
    WebElement selectUserDropDown;

    @FindBy(id = "vs1__listbox")
    @CacheLookup
    WebElement usersDropdown;

    @FindBy(xpath = "//input[@placeholder='Meeting Location']")
    @CacheLookup
    WebElement meetingLocation;

    @FindBy(xpath = "//input[@placeholder='Add Calendar Name']")
    @CacheLookup
    WebElement calendarName;

    @FindBy(xpath = "//input[@placeholder='Enter Calendar Slug']")
    @CacheLookup
    WebElement calendarSlug;

    @FindBy(xpath = "cmp-calmodal__button--save")
    @CacheLookup
    WebElement teamAndEventSetupSaveAndContinueButton;

    @FindBy(xpath = "cmp-calmodal__button--save")
    @CacheLookup
    WebElement availabilitySaveAndContinueButton;

    @FindBy(xpath = "cmp-calmodal__button--save")
    @CacheLookup
    WebElement completeButton;


    public CreateCalendar(WebDriver driver) {
        super(driver);
    }

    public void waitForElement() {
        waitForElement(overlay, 10);
    }

    public void clickCreateCalendarButton() {
        waitForElement(createCalendarButton, 10);
        createCalendarButton.click();
    }

    public void clickRoundRobin() {
        waitForElement(selectRoundRobin, 10);
        selectRoundRobin.click();
    }

    public void clickAddUserButton() {
        waitForElement(addUserButton, 10);
        addUserButton.click();
    }

    public void clickSelectUserDropDown() {
        waitForElement(selectUserDropDown, 10);
        selectUserDropDown.click();
    }

    public void selectUserFromDropDown(String user) {
        selectElementByText(usersDropdown, user);
    }

    public void enterMeetingLocation() {
        waitForElement(meetingLocation, 10);
        meetingLocation.sendKeys("Pune");
    }

    public void enterCalendarName() {
        waitForElement(calendarName, 10);
        calendarName.sendKeys("abc");
    }

    public void enterCalendarSlug() {
        waitForElement(calendarSlug, 10);
        calendarSlug.sendKeys("abc");
    }

    public void clickTeamAndEventSetupSaveAndContinueButton() {
        waitForElement(teamAndEventSetupSaveAndContinueButton, 10);
        teamAndEventSetupSaveAndContinueButton.click();
    }

    public void clickAvailabilitySaveAndContinueButton() {
        waitForElement(availabilitySaveAndContinueButton, 10);
        availabilitySaveAndContinueButton.click();
    }

    public void clickCompleteButton() {
        waitForElement(completeButton, 10);
        completeButton.click();
    }
}
