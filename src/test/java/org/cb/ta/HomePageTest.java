package org.cb.ta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

    HomePage homePage = new HomePage();

    @Test
    public void nav_titleIdDisplayed(){
        homePage.controlTitle();
    }
    @Test
    public void EnabledControlForButtonLink(){
        Assert.assertEquals(true, homePage.isLinkEnabled());
    }
    @Test
    public void clickButtonlink(){
        homePage.clickButtonlink();
    }
    @Test
    public void clickToDoList(){
        homePage.clickToDoListLink();
    }
    @Test
    public void testAccordionPage(){
        Assert.assertTrue(homePage.accordionPage(),"Accordion page is not displayed or something went wrong.");
    }

}
