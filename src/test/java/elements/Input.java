package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String tag;

    String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//%s";

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
        System.out.printf("Writing text '%s' input with label: '%s'%n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator, this.label, this.tag))).sendKeys(text);
    }
}
