package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountListPage extends BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.debug("start check if page Accounts is opened");
        return isExist(BREADCRUMBS_LABEL);
    }

    public AccountListPage open(){
        log.info(String.format("Going on page '%s'/lightning/o/Account/list?filterName=Recent", BASE_URL));
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public AccountModalPage clickNew(){
        driver.findElement(NEW_BUTTON).click();
        log.debug("Button 'New' in Account page was clicked");
        return new AccountModalPage(driver);
    }
}
