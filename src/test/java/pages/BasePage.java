package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public abstract class BasePage {

    public static final String BASE_URL = "https://qaonlgizyuk2.lightning.force.com";
    public static final By NEW_BUTTON = By.xpath("//a[@title='New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']|//button[@name='SaveEdit']");

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public abstract boolean isPageOpen();

    protected boolean isExist(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        }
        catch (NoSuchElementException ex){
            log.error("ERROR in isExist method" + ex.getMessage());
            return false;
        }
    }

}
