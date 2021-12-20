package tests;

import models.Account;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest{
    @Test
    public void accountShouldBeCreated(){
        loginPage
                .open()
                .login("king.giz-gy4p@force.com" , "SalesForce21");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        assertTrue(isAccountModalOpen, "Попап не открылся" );

        // TODO заполнить все поля
        // TODO добавить дескрипшин к аннотациям тест всех тестов
        // Account account = new Account("TestAccName", "www.tms.by", "Investor");
        Account account = new Account(
                "+375336001004",
                "AccountName",
                "www.website.by",
                "Investor",
                "23",
                "Banking",
                "description",
                "Billing street",
                "Shipping street",
                "Billing city",
                "Billing State",
                "Shipping city",
                "Shipping state",
                "Billing zip",
                "Billing country",
                "Shipping zip",
                "Shipping country");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .clickOnDetailsTab()
                .isPageOpen();

        assertTrue(isDetailsPageOpen, "Страница Details не открылась" );

        // TODO write getLinkValueByName

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

    }
}
