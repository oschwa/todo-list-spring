package dev.oliver.todobackend.repository;

import dev.oliver.todobackend.entity.TodoAccount;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TodoAccountRepositoryTest {

    @Autowired
    private TodoAccountRepository todoAccountRepository;

    @Test
    public void todoAccountRepositoryContextLoadsTest() {
        assertNotNull(todoAccountRepository);
    }

    @Test
    public void todoAccountRepositoryReturnsById() {
        TodoAccount newAccount = new TodoAccount("username",
                "password", "email@website.com");

        todoAccountRepository.save(newAccount);

        TodoAccount returnAccount = todoAccountRepository.findById(1).get();
        assertNotNull(returnAccount);
    }
}