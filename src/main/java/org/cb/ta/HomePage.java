package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Driver {
    private WebDriver driver;

    public HomePage() {
        /*System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/index.html");*/

        // driver=new Driver();
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

}
