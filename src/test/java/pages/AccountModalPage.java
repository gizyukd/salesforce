package pages;

import elements.Dropdown;
import elements.Input;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountModalPage extends BasePage{

    public static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'inlineTitle')]");

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("start checking if account modal page is opened");
        return isExist(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account) {
        log.info("filling fields of Account modal page");

        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new Dropdown(driver, "Type").selectOption(account.getType());
        new Input(driver, "Employees").write(account.getEmployees());
        new Dropdown(driver, "Industry").selectOption(account.getIndustry());
        new Input(driver, "Description", "textarea").write(account.getDescription());
        new Input(driver, "Billing Street", "textarea").write(account.getBillingStreet());
        new Input(driver, "Shipping Street", "textarea").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());

        log.info("filling fields of Account modal page");
        return clickSave();
    }

    public AccountDetailsPage clickSave(){
        log.info(String.format("Clicking on Save button with Xpath: '%s'", SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
        log.info("Save button was clicked");
        return new AccountDetailsPage(driver);
    }
}
