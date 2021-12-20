package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AccountDetailsPage extends BasePage{

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    String fieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
    String employeesFieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-number";
    String phoneFieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-phone";
    String websiteFieldValue = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-url";
    String streetFieldValue = "//div//span[@force-recordlayoutitem_recordlayoutitem and contains(text(), '%s')]/../..//a/div[1]";
    String cityAndStateFieldValue = "//div//span[@force-recordlayoutitem_recordlayoutitem and contains(text(), '%s')]/../..//a/div[2]";
    String countryFieldValue = "//div//span[@force-recordlayoutitem_recordlayoutitem and contains(text(), '%s')]/../..//a/div[3]";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public String getDefaultFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public String getPhoneFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(phoneFieldValue, fieldName))).getText();
    }

    public String getEmployeeFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(employeesFieldValue, fieldName))).getText();
    }

    public String getWebsiteFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(websiteFieldValue, fieldName))).getText();
    }

    public String getStreetFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(streetFieldValue, fieldName))).getText();
    }

    public String getCityAndStateFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(cityAndStateFieldValue, fieldName))).getText();
    }

    public String getCountryFieldValueByName(String fieldName) {
        return driver.findElement(By.xpath(String.format(countryFieldValue, fieldName))).getText();
    }

    public AccountDetailsPage clickOnDetailsTab(){
        driver.findElement(DETAILS_LINK).click();
        return new AccountDetailsPage(driver);
    }

    public void moveToCountryField(String fieldName) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(String.format(countryFieldValue, fieldName))));
    }
}
