package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Log4j2
public class AccountTest extends BaseTest{

    @Test
    public void accountShouldBeCreated(){
        log.info("Start running test accountShouldBeCreated");
        log.info("Log in");
        loginPage
                .open()
                .login("king.giz-et61@force.com" , "Tms09onl");
        log.info("Log in is successful");

        log.info("Open Accounts Page and click on New button");
        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        log.info("Check if Account Modal page was opened");
        assertTrue(isAccountModalOpen, "Попап не открылся" );

        log.debug("Creating a new Account object");
        Account account = AccountFactory.get();

        log.info("Start creating a new account");
        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .clickOnDetailsTab()
                .isPageOpen();

        log.info("Check if Account's Detail page was opened");
        assertTrue(isDetailsPageOpen, "Страница Details не открылась" );
        log.info("Account's Detail page was opened");

        log.info("Check if data of created account matches with written in modal page fields");
        assertEquals(accountDetailsPage.getPhoneFieldValueByName("Phone"), account.getPhone(),"Не занесено значение в поле Phone");
        assertEquals(accountDetailsPage.getDefaultFieldValueByName("Account Name"), account.getAccountName(),"Не занесено значение в поле Account Name");
        assertEquals(accountDetailsPage.getWebsiteFieldValueByName("Website"), account.getWebSite(),"Не занесено значение в поле Website");
        assertEquals(accountDetailsPage.getDefaultFieldValueByName("Type"), account.getType(),"Не занесено значение в поле Type");
        assertEquals(accountDetailsPage.getEmployeeFieldValueByName("Employees"), account.getEmployees(),"Не занесено значение в поле Employees");
        assertEquals(accountDetailsPage.getDefaultFieldValueByName("Industry"), account.getIndustry(),"Не занесено значение в поле Industry");
        assertEquals(accountDetailsPage.getDefaultFieldValueByName("Description"), account.getDescription(),"Не занесено значение в поле Description");
        assertEquals(accountDetailsPage.getStreetFieldValueByName("Billing Address"), account.getBillingStreet(),"Не занесено значение в поле Billing Street");
        assertEquals(accountDetailsPage.getStreetFieldValueByName("Shipping Address"), account.getShippingStreet(),"Не занесено значение в поле Shipping Street");
        assertEquals(accountDetailsPage.getCityAndStateFieldValueByName("Billing Address"), account.getBillingCity() + ", " + account.getBillingState() + " " + account.getBillingZip(),"Не занесено значение в поле Billing City");
        assertEquals(accountDetailsPage.getCityAndStateFieldValueByName("Shipping Address"), account.getShippingCity() + ", " + account.getShippingState() + " " + account.getShippingZip(),"Не занесено значение в поле Shipping City");
        accountDetailsPage.moveToCountryField("Billing Address");
        assertEquals(accountDetailsPage.getCountryFieldValueByName("Billing Address"), account.getBillingCountry(),"Не занесено значение в поле Billing Country");
        assertEquals(accountDetailsPage.getCountryFieldValueByName("Shipping Address"), account.getShippingCountry(),"Не занесено значение в поле Shipping Country");

        log.info("Data of created account fully matches with written in modal page fields");
        log.info("Finish test " + "accountShouldBeCreated");

    }
}
