package step_definations;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page_objects.Calendars;
import page_objects.CreateCalendar;
import page_objects.MainPage;
import utils.RandomGenerator;

public class AddNewCalendarFunctionality {

    public WebDriver driver;
    public MainPage mainPage;
    public Calendars calendars;
    public CreateCalendar createCalendar;

    @Given("Launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.safari.driver", "/Users/swapnil/Desktop/demoproject/chromedriver_mac64/chromedriver");
        driver = WebDriverManager.safaridriver().create();
        mainPage = new MainPage(driver);
        calendars = new Calendars(driver);
        createCalendar = new CreateCalendar(driver);
    }

    @When("User open URL {string}")
    public void user_open_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User enter username as {string}")
    public void user_enter_username_as(String userName) {
        mainPage.enterUsername(userName);
    }

    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {
        mainPage.enterPassword(password);
    }

    @When("Click on Sign In button")
    public void click_on_sign_in_button() {
        mainPage.clickSignIn();
    }

    @Then("Verify Dashboard Page Is Displayed")
    public void verify_dashboard_page_is_displayed() {
        mainPage.confirmDashboardIsVisible();
    }

    @And("Click on Calendars Tab, Click on Calendar Setting")
    public void navigateToCalendars() {
        mainPage.clickCalendar();
        mainPage.clickCalendarSetting();
    }

    @And("Click on Create Calendar Button, Select Round Robin Calendar Type, Click on Add User, Select User, Enter Meeting Location, Calendar name, Calendar URL, Click on Save and Continue Button two times, Click on Complete Button")
    public void createCalendar() {
        createCalendar.waitForElement();
        createCalendar.clickCreateCalendarButton();
        createCalendar.clickRoundRobin();
        createCalendar.clickAddUserButton();
        createCalendar.clickSelectUserDropDown();
        String user = " Test User 1 ";
        createCalendar.selectUserFromDropDown(user);
        createCalendar.enterMeetingLocation(RandomGenerator.randomString(4));
        createCalendar.enterCalendarName(RandomGenerator.randomString(4));
        createCalendar.enterCalendarSlug(RandomGenerator.randomString(5));
        createCalendar.clickTeamAndEventSetupSaveAndContinueButton();
        createCalendar.clickAvailabilitySaveAndContinueButton();
        createCalendar.clickCompleteButton();
    }

    @Then("Verify Calendar is added")
    public void verify_calendar_is_added() {
        calendars.confirmCalendarContainerIsVisible();
    }

    @And("Close the Browser")
    public void close_the_browser() {
        driver.quit();
    }
}
