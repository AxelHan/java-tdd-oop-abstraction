package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testGetters(){
        TodoItem item = new TodoItem("Clean", "done before wednesday");

        Assertions.assertEquals("incomplete", item.getStatus());
        Assertions.assertEquals("Clean", item.getTitle());
        Assertions.assertEquals("done before wednesday", item.getDetail());
    }

    @Test
    public void testSetters(){
        TodoItem item = new TodoItem("Cook", "done before saturday");

        item.setTitle("Clean");
        item.setDetail("done before wednesday");
        item.changeStatus();

        Assertions.assertEquals("complete", item.getStatus());
        Assertions.assertEquals("Clean", item.getTitle());
        Assertions.assertEquals("done before wednesday", item.getDetail());
    }

}
