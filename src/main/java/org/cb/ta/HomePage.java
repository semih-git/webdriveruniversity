package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Driver {
    final WebDriver driver;

    public HomePage() {
        driver = Driver.getdriver();
        String homepageurl = "https://webdriveruniversity.com/index.html";
        driver.get(homepageurl);
    }

    public void controltitle() {
        WebElement nav_title = driver.findElement(By.xpath("//a[@id='nav-title']"));
        nav_title.isDisplayed();
        System.out.println("title displayed");
    }

    public void clickbuttonlink() {
        WebElement buttonlink = driver.findElement(By.xpath("//a[@id='button-clicks']"));
        buttonlink.click();
        System.out.println("buttonlink  clicked");
    }

    public boolean clickToDoListLink(){
        WebElement buttonLink = driver.findElement(By.xpath("//a[@id=\"to-do-list\"]"));
        buttonLink.click();
        return buttonLink.isDisplayed();
    }

}
