package tests;

import models.Account;
import org.testng.annotations.Test;
import pages.AccountModalPage;

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
     //   Account account = new Account("TestAccName", "www.tms.by", "Investor");
        Account account = new Account(
                "+375336001004",
                "FullAccName",
                "Parent acc",
                "www.tms.by",
                "Investor",
                "23",
                "Banking",
                "description",
                "Groove street",
                "Malinovka street",
                "Los Santos",
                "Billing State",
                "Shipping city",
                "Shipping state",
                "Billing Zip",
                "Billing Country",
                "Shipping Zip",
                "Shipping Country");


        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();

        assertTrue(isDetailsPageOpen, "Страница Details не открылась" );
// TODO write getLinkValueByName
        assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(),"Не занесено значение в поле Phone");
        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(),"Не занесено значение в поле Account Name");
       // assertEquals(accountDetailsPage.getFieldValueByName("Fax"), account.getFax(),"Не занесено значение в поле Fax");
       // assertEquals(accountDetailsPage.getFieldValueByName("Parent Account"), account.getParentAccount(),"Не занесено значение в поле Parent Account");
        assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(),"Не занесено значение в поле Website");
        assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(),"Не занесено значение в поле Type");
        assertEquals(accountDetailsPage.getFieldValueByName("Employees"), account.getEmployees(),"Не занесено значение в поле Employees");
        assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(),"Не занесено значение в поле Industry");
       // assertEquals(accountDetailsPage.getFieldValueByName("Annual Revenue"), account.getAnnualRevenue(),"Не занесено значение в поле Annual Revenue");
        assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(),"Не занесено значение в поле Description");
        assertEquals(accountDetailsPage.getFieldValueByName("Billing Street"), account.getBillingStreet(),"Не занесено значение в поле Billing Street");
        assertEquals(accountDetailsPage.getFieldValueByName("Shipping Street"), account.getShippingStreet(),"Не занесено значение в поле Shipping Street");
        assertEquals(accountDetailsPage.getFieldValueByName("Billing City"), account.getBillingCity(),"Не занесено значение в поле Billing City");
        assertEquals(accountDetailsPage.getFieldValueByName("Billing State/Province"), account.getBillingState(),"Не занесено значение в поле Billing State/Province");
        assertEquals(accountDetailsPage.getFieldValueByName("Shipping City"), account.getShippingCity(),"Не занесено значение в поле Shipping City");
        assertEquals(accountDetailsPage.getFieldValueByName("Shipping State/Province"), account.getShippingState(),"Не занесено значение в поле Shipping State/Province");
        assertEquals(accountDetailsPage.getFieldValueByName("Billing Zip/Postal Code"), account.getBillingZip(),"Не занесено значение в поле Billing Zip/Postal Code");
        assertEquals(accountDetailsPage.getFieldValueByName("Billing Country"), account.getBillingCountry(),"Не занесено значение в поле Billing Country");
        assertEquals(accountDetailsPage.getFieldValueByName("Shipping Zip/Postal Code"), account.getShippingZip(),"Не занесено значение в поле Shipping Zip/Postal Code");
        assertEquals(accountDetailsPage.getFieldValueByName("Shipping Country"), account.getShippingCountry(),"Не занесено значение в поле Shipping Country");
    }
}
