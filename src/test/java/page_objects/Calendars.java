package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Calendars extends BasePage {

    @FindBy(xpath = "//table[@class='n-data-table-table']")
    @CacheLookup
    WebElement calendarContainer;

    public Calendars(WebDriver driver) {
        super(driver);
    }

    public void confirmCalendarContainerIsVisible() {
        waitForElement(calendarContainer, 10);
        calendarContainer.isDisplayed();
    }
}
