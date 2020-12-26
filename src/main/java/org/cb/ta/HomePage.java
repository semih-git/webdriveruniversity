package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    WebElement buttonlink;
    WebElement accordionPageLink;


    public HomePage() {
        driver = Driver.getdriver();
        String homepageurl = "https://webdriveruniversity.com/index.html";
        driver.get(homepageurl);
    }

    public void controlTitle() {
        WebElement nav_title = driver.findElement(By.xpath("//a[@id='nav-title']"));
        nav_title.isDisplayed();
        System.out.println("title displayed");
    }
    public boolean isLinkEnabled(){
        buttonlink=driver.findElement(By.xpath("//a[@id='button-clicks']"));
        return buttonlink.isEnabled();
    }

    public void clickButtonlink() {
        buttonlink = driver.findElement(By.xpath("//a[@id='button-clicks']"));
        buttonlink.click();
        System.out.println("buttonlink  clicked");
    }

    public boolean clickToDoListLink(){
        WebElement buttonLink = driver.findElement(By.xpath("//a[@id=\"to-do-list\"]"));
        buttonLink.click();
        return buttonLink.isDisplayed();
    }
    public boolean accordionPage(){
        accordionPageLink = driver.findElement(By.xpath("//a[@href='Accordion/index.html']"));
        if(accordionPageLink.isDisplayed()){
            accordionPageLink.click();
            return true;
        }
        return false;
    }
}
