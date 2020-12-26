package org.cb.ta;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccordionPageTest {
    AccordionPage accordionPage = new AccordionPage();

    @Test
    public void testHeaderIsDisplayed() {
        assertTrue(accordionPage.headerIsDisplayed());
    }
    @Test
    public void testManualTestingButtonIsClickable() throws InterruptedException {
        Assert.assertTrue(accordionPage.manualTestingButtonIsClickable());
    }

}