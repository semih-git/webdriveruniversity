package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver getdriver(){
        String browserType = "chrome";
        switch (browserType){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver","webdriver\\geckodriver.exe");
                return new FirefoxDriver();
            case "safari":
                System.setProperty(" "," ");
                return new SafariDriver();
            default:
                //if browser type is wrong, throw and exception showing us browser will not be openned.
                throw new RuntimeException("Wrong browser type!");
        }
    }
}