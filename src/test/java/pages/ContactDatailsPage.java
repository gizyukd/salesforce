package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDatailsPage extends BasePage{

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");


    public ContactDatailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public ContactDatailsPage clickOnDetailsTab(){
        driver.findElement(DETAILS_LINK).click();
        return new ContactDatailsPage(driver);
    }
}
