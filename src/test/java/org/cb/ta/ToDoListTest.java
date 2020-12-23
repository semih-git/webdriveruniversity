package org.cb.ta;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ToDoListTest {
    ToDoList toDoList = new ToDoList();

    @Test // (enabled = false) -> calismasini istemedigimiz testler icin boyle yapilabilir.
    public void clickPlusTest() throws InterruptedException {
        toDoList.clickPlus();
    }
    @Test
    public void addNewToDoTest() throws InterruptedException {
        toDoList.addNewToDo();
    }
    @Test
    public void deleteToDo() {
        toDoList.deleteToDo();
    }
    @Test(dependsOnMethods = {"addNewToDoTest"})
    public void testDeleteOneTask() {
        assertTrue(toDoList.deleteOneTask("do Something"));
    }
}
