package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccordionPage {
    WebDriver driver;

    WebElement pageHeader;
    WebElement manualTestingButton;
    WebElement manualTestingText;

    public AccordionPage() {
        this.driver = Driver.getdriver();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");

        pageHeader = driver.findElement(By.xpath("//h1"));
        manualTestingButton = driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
        manualTestingText = driver.findElement(By.xpath("//p[contains(text(),\"Manual testing has\")]"));
    }
    public boolean headerIsDisplayed(){
        return pageHeader.isDisplayed();
    }
    public boolean manualTestingButtonIsClickable() throws InterruptedException {
        if(manualTestingButton.isDisplayed()){
            manualTestingButton.click();
            Thread.sleep(1000);
            manualTestingButton.click();
            return true;
        }
        return false;
    }
    public boolean manualTestingTextIsDisplayed(){
        return manualTestingText.isDisplayed();
    }
    public boolean manualTestingTextIsClosed(){
        return manualTestingText.getAttribute("Style").equals("max-height: 90px;");

    }
}
