package tests;

import models.Contact;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest{

    @Test
    public void contactShouldBeCreated() {
        loginPage
                .open()
                .login("king.giz-gy4p@force.com", "SalesForce21");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();

        assertTrue(isContactModalOpen, "Попап не открылся");

        Contact contact = new Contact(
                "Mr.",
                "firstName",
                "lastName",
                "suffix",
                "accountName",
                "title",
                "department",
                "email",
                "fax",
                "phone",
                "mobile",
                "searchAddress",
                "mailingStreet",
                "mailingCity",
                "mailingState",
                "mailingZip");

        //TODO добавить wait для модального окна ContactModalPage
        boolean isDetailsPageOpen = contactModalPage
                .create(contact)
                .clickOnDetailsTab()
                .isPageOpen();

        assertTrue(isDetailsPageOpen, "Страница Details не открылась" );

    }

}
