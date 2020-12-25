package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

class ClickbuttonPageTest {
    ClickbuttonsPage clickbuttonsPage=new ClickbuttonsPage();

    @Test
    public void maintitletest(){
        clickbuttonsPage.mainTitleControl();
    }
    @Test
    public void webelementclickbuttoncontrol(){
        clickbuttonsPage.webElememntClickButtonControl();
    }
    @Test
    public void jsclickbuttoncontrol(){
        clickbuttonsPage.javaScriptClickButtonControl();
    }
    @Test
    public void clickwbbutton(){
        clickbuttonsPage.webButtonClick();
    }
    @Test
    public void closewbpopup() throws InterruptedException {
        clickbuttonsPage.clickCloseWebPopUp();
    }
    @Test
    public void jsbuttonclick(){
        clickbuttonsPage.jsButtonClick();
    }
//    @Test
//    public void clickCloseJSPopUp() throws InterruptedException {
//        clickbuttonsPage.clickCloseJSPopUp();
//    }
}