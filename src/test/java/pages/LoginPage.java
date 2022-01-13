package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

@Log4j2
public class LoginPage extends BasePage{

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open(){
        log.info("Opening login page");
        driver.get(BASE_URL);
        return this;
    }

    public HomePage login(String userName, String password){
        log.info("Start logging in..." );
        log.info(String.format("Typing text '%s' in login field with Xpath: '%s'", userName, USERNAME_INPUT));
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        log.info(String.format("Typing text '%s' in login field with Xpath: '%s'", password, PASSWORD_INPUT));
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info(String.format("Clicking on button with Xpath: '%s'", LOGIN_BUTTON));
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("start checking if the Login page is opened");
        return isExist(LOGIN_BUTTON);
    }

}
