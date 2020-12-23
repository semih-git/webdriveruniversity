package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToDoList {
    WebDriver driver;
    WebElement toDoListElement;

    public ToDoList() {
        this.driver = Driver.getdriver();
        driver.get("http://www.webdriveruniversity.com/To-Do-List/index.html");
        webElementDefination();

    }
    public void webElementDefination(){
        toDoListElement=driver.findElement(By.xpath("//i[@ id='plus-icon']"));
    }
    public void clickPlus() throws InterruptedException {
        System.out.println(toDoListElement.getText());
        toDoListElement.isDisplayed();
        toDoListElement.click();
        Thread.sleep(2000);
        toDoListElement.click();
    }
    public void addNewToDo() throws InterruptedException {
        toDoListElement = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        toDoListElement.clear();
        toDoListElement.sendKeys("ABC");
        Thread.sleep(1000);
        toDoListElement.clear();
        toDoListElement.sendKeys("DEF");
        Thread.sleep(1000);
        //toDoListElement.sendKeys(Keys.RETURN); // RETURN yada ENTER ikiside olabilir.
        toDoListElement.sendKeys(Keys.ENTER);

    }
}
