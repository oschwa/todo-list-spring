package dev.oliver.todobackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.oliver.todobackend.entity.TodoAccount;

@SpringBootTest
class TodoBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void accountInstanceTest() {
        TodoAccount newAccount = new TodoAccount("", "", "");
        assertEquals(newAccount.getClass(), TodoAccount.class);
    }

    @Test
    void accountUserNameTest() {
        TodoAccount newAccount = new TodoAccount("testname", "");
        assertEquals(newAccount.getUserName(), "testname");
    }

    @Test
    void accountPasswordTest() {
        TodoAccount newAccount = new TodoAccount("", "testpassword");
        assertEquals(newAccount.getPassword(), "testpassword");
    }

    @Test
    void accountEmailTest() {
        TodoAccount newAccount = new TodoAccount("", "", "testemail@email.com");
        assertEquals(newAccount.getEmail(), "testemail@email.com");
    }

}
