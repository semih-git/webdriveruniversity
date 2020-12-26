package org.cb.ta;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccordionPageTest {
    AccordionPage accordionPage = new AccordionPage();

    @Test
    public void testHeaderIsDisplayed() {
        accordionPage.headerIsDisplayed();
    }
}