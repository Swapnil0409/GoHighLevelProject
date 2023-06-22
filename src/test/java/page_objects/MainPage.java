package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.random.RandomGenerator;

public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Your email address']")
    @CacheLookup
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder='The password you picked']")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath = "//button[contains(text(), 'Sign in')]")
    @CacheLookup
    WebElement signIn;

    @FindBy(xpath = "(//div[@class='container-fluid'])[2]")
    @CacheLookup
    WebElement dashboard;

    @FindBy(xpath = "(//span[contains(text(), 'Calendars')])[1]")
    @CacheLookup
    WebElement calendar;

    @FindBy(xpath = "(//span[contains(text(), 'Calendar Settings')])[1]")
    @CacheLookup
    WebElement calendarSetting;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String uName) {
        waitForElement(userName, 10);
        userName.clear();
        userName.sendKeys(uName);
    }

    public void enterPassword(String password) {
        waitForElement(passWord, 10);
        passWord.clear();
        passWord.sendKeys(password);
    }

    public void clickSignIn() {
        waitForElement(signIn, 10);
        signIn.click();
    }

    public void confirmDashboardIsVisible() {
        waitForElement(dashboard, 10);
        dashboard.isDisplayed();
    }

    public void clickCalendar() {
        waitForElement(calendar, 10);
        calendar.click();
    }

    public void clickCalendarSetting() {
        waitForElement(calendarSetting, 10);
        calendarSetting.click();
    }
}
