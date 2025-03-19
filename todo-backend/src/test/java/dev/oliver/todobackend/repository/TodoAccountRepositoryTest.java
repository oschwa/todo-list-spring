package dev.oliver.todobackend.repository;
import dev.oliver.todobackend.entity.TodoUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TodoAccountRepositoryTest {

    @Autowired
    private TodoUserRepository todoAccountRepository;

    @Test
    public void todoUserRepositoryContextLoadsTest() {
        assertNotNull(todoAccountRepository);
    }

    @Test
    public void todoUserRepositoryReturnsById() {
        TodoUser newUser = new TodoUser();

        todoAccountRepository.save(newUser);

        Optional<TodoUser> returnAccount = todoAccountRepository.findById(newUser.getId());
        assertNotNull(returnAccount);
    }

    @Test
    public void todoUserRepositoryReturnsAll() {
        TodoUser firstAccount = new TodoUser();
        TodoUser secondAccount = new TodoUser();

        todoAccountRepository.save(firstAccount);
        todoAccountRepository.save(secondAccount);

        List<TodoUser> accountList = todoAccountRepository.findAll();
        assertNotNull(accountList);
        assertTrue(accountList.size() > 1);
    }
}