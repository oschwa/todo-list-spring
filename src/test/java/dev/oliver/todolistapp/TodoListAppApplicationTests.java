package dev.oliver.todolistapp;

import dev.oliver.todolistapp.tasks.Task;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class TodoListAppApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void makeTaskTitleTest() {
        Task task = new Task("Test Title");
        assertEquals(task.getTitle(), "Test Title");
    }
    @Test
    void makeTaskTitleDateTest() {
        Task task = new Task("Test Title", "11-14-2024");
        assertEquals(task.getTitle(), "Test Title");
        assertEquals(task.getDate(), "11-14-2024");
    }
    @Test
    void makeTaskTitleDateDescTest() {
        Task task = new Task("Test Title", "11-14-2024", new ArrayList<>());
        assertEquals(task.getTitle(), "Test Title");
        assertEquals(task.getDate(), "11-14-2024");
        assertEquals(task.getDescription(), new ArrayList<>());
    }


}
