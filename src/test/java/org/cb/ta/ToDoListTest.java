package org.cb.ta;

import org.testng.annotations.Test;

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

}
