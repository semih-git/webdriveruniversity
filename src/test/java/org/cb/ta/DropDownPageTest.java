package org.cb.ta;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownPageTest {
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void testSelectAnOptionFromDropDownMenu() {
        assertTrue(dropDownPage.selectAnOptionFromDropDownMenu("python"));
    }

    @Test
    public void testSelectAnOptionFromDropDownMenuUsingIndex() {
        assertTrue(dropDownPage.selectAnOptionFromDropDownMenuUsingIndex(2));
    }
}