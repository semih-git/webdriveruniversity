package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    WebElement dropDownMenu1;
    WebElement dropDownMenu2;

    public DropDownPage() {
        this.driver = Driver.getdriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        this.dropDownMenu2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));

    }

    public boolean selectAnOptionFromDropDownMenu(String optionName) {
        this.dropDownMenu1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
        Select dropDownMenuSelectObj = new Select(dropDownMenu1);
        dropDownMenuSelectObj.selectByValue(optionName);
        WebElement element = dropDownMenuSelectObj.getFirstSelectedOption();

        return element.getAttribute("value").equals(optionName);
    }

    public boolean selectAnOptionFromDropDownMenuUsingIndex(int index) {
        Select dropDownMenuSelectObj = new Select(dropDownMenu2);
        dropDownMenuSelectObj.selectByIndex(index);
        WebElement element = dropDownMenuSelectObj.getFirstSelectedOption();
        String optionValue = element.getAttribute("value");
        return optionValue.equals("testng");
    }

}
