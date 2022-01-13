package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class HomePage extends BasePage{

    public static final By MENU_HOME_LINK = By.xpath("//span[@class='slds-truncate'][text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MENU_HOME_LINK);
    }

    public HomePage open(){
        log.debug("Try open Home Page");
        driver.get(BASE_URL + "/lightning/page/home");
        return this;
    }
}
