package pages;

import elements.Dropdown;
import elements.Input;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage{

    public static final By MODAL_TITLE = By.xpath("//records-lwc-detail-panel/*[contains(@class, 'slds-modal__header')]");
    //button[@name='SaveEdit']

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public ContactDatailsPage create(Contact contact){
        // //new Dropdown(driver, "Salutation").selectOption(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        //new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new Input(driver, "Account Name").write(contact.getAccountName());
        //new Input(driver, "Reports To").write(contact.());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Search Address").write(contact.getSearchAddress());
        new Input(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());

        return clickSave();
    }

    public ContactDatailsPage clickSave(){
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDatailsPage(driver);
    }
}
