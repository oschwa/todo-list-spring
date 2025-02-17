package dev.oliver.todobackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.oliver.todobackend.domain.Account;

@SpringBootTest
class TodoBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void accountInstanceTest() {
        Account newAccount = new Account();
        assertEquals(newAccount.getClass(), Account.class);
    }

    @Test
    void accountUserNameTest() {
        Account newAccount = new Account("testname", "");
        assertEquals(newAccount.getUserName(), "testname");
    }

    @Test
    void accountPasswordTest() {
        Account newAccount = new Account("", "testpassword");
        assertEquals(newAccount.getPassword(), "testpassword");
    }

    @Test
    void accountEmailTest() {
        Account newAccount = new Account("", "", "testemail@email.com");
        assertEquals(newAccount.getEmail(), "testemail@email.com");
    }

}
