package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Input {
    WebDriver driver;
    String label;
    String tag;

    //String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//%s";
    String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input"
            + "|//div[contains(@class, 'modal-body')]//*[text()='%s']/ancestor::lightning-input//div";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        this.tag = "input";
    }

    public Input(WebDriver driver, String label, String tag) {
        this.driver = driver;
        this.label = label;
        this.tag = tag;
    }

    public void write(String text){
        log.info(String.format("Writing text '%s' input with label: '%s'%n", text, this.label));
        driver.findElement(By.xpath(String.format(inputLocator, this.label, this.label))).sendKeys(text);
    }
}
