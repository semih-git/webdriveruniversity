package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver getdriver(){
        System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}