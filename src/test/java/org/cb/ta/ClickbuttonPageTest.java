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
    @Test(priority = 1)
    public void closewbpopup() throws InterruptedException {
        clickbuttonsPage.clickCloseWebPopUp();
    }
    @Test(priority = 2)
    public void jsbuttonclick() throws InterruptedException {
        clickbuttonsPage.jsButtonClick();
    }
    @Test(priority = 3)
    public void testJsButtonPopupClose() {
        clickbuttonsPage.jsButtonPopupClose();
    }
    @Test(priority = 4)
    public void actionMoveClickButonTest() {
        clickbuttonsPage.actionMoveClickButon();
    }
}