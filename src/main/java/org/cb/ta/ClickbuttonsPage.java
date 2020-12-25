package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickbuttonsPage {

    WebDriver driver;
    WebElement webclickbutton;
    WebElement conguralationstitle;
    WebElement maintitle;
    WebElement jsclickbutton;
    WebElement closebutton;
    WebElement clsbutton;

    public void WebElementDefinition(){
        maintitle = driver.findElement(By.xpath("//div[@id='main-header']"));
        webclickbutton = driver.findElement(By.xpath("//span[@id='button1']"));
        conguralationstitle = driver.findElement(By.xpath("//h4[@class='modal-title']"));
        jsclickbutton = driver.findElement(By.xpath("//span[@id='button2']"));
        closebutton = driver.findElement(By.xpath("//button[@class='close']"));
        clsbutton = driver.findElement(By.xpath("//div[@id='myModalJSClick']/div/div/div/button"));
    }
    public ClickbuttonsPage() {
        driver=Driver.getdriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
    }
    public void mainTitleControl(){
        WebElementDefinition();
        maintitle.isDisplayed();
        System.out.println(maintitle.getText());
    }
    public void webElememntClickButtonControl(){
        WebElementDefinition();
        webclickbutton.isDisplayed();
        System.out.println("web element click button seemed");
    }
    public void javaScriptClickButtonControl(){
        WebElementDefinition();
        jsclickbutton.isDisplayed();
        System.out.println("js click button seemed");
    }
    public void webButtonClick(){
        WebElementDefinition();
        webclickbutton.click();
        conguralationstitle.isDisplayed();
    }
    public void clickCloseWebPopUp() throws InterruptedException {
        WebElementDefinition();
        Thread.sleep(1000);
        closebutton.click();
    }
    public void jsButtonClick(){
        WebElementDefinition();
        jsclickbutton.click();
    }
//    public void clickCloseJSPopUp() throws InterruptedException {
//        WebElementDefinition();
//        Thread.sleep(1000);
//        clsbutton.click();
//    }
}
