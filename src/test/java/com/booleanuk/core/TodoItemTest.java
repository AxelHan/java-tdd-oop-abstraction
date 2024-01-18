package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    public void testGetters(){
        TodoItem item = new TodoItem("Clean", "done before wednesday", "incomplete");

        Assertions.assertEquals("incomplete", item.getStatus());
        Assertions.assertEquals("Clean", item.getTitle());
        Assertions.assertEquals("done before wednesday", item.getDetail());
    }

    @Test
    public void testSetters(){
        TodoItem item = new TodoItem("Cook", "done before saturday", "complete");

        item.setTitle("Clean");
        item.setDetail("done before wednesday");
        item.chageStatus();

        Assertions.assertEquals("incomplete", item.getStatus());
        Assertions.assertEquals("Clean", item.getTitle());
        Assertions.assertEquals("done before wednesday", item.getDetail());
    }

}
