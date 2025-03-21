package dev.oliver.todobackend.service;

import dev.oliver.todobackend.entity.TodoUser;
import dev.oliver.todobackend.entity.TodoUserRole;
import dev.oliver.todobackend.repository.TodoUserRepository;
import dev.oliver.todobackend.service.impl.TodoUserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoUserServiceTests {

    @Mock
    private TodoUserRepository todoUserRepository;

    @InjectMocks
    private TodoUserServiceImpl todoUserService;

    @Test
    public void contextLoadsTodoUserRepository() {
        assertNotNull(todoUserRepository);
    }

    @Test
    public void contextLoadsTodoUserService() {
        assertNotNull(todoUserService);
    }

    @Test
    public void todoUserServiceReturnsAll() {
        TodoUser exampleUserOne = new TodoUser();
        TodoUser exampleUserTwo = new TodoUser();

        when(todoUserRepository.findAll()).thenReturn(List.of(exampleUserOne, exampleUserTwo));
        when(todoUserRepository.save(exampleUserOne)).thenReturn(exampleUserOne);
        when(todoUserRepository.save(exampleUserTwo)).thenReturn(exampleUserTwo);

        TodoUser userOne = todoUserService.createUser(exampleUserOne);
        TodoUser userTwo = todoUserService.createUser(exampleUserTwo);

        List<TodoUser> returnedUsers = todoUserService.findAll();

        assertEquals(userOne, returnedUsers.get(0));
        assertEquals(userTwo, returnedUsers.get(1));
    }

    @Test
    public void todoUserServiceCreatesAndReturnsUserById() {
        TodoUser exampleUser = new TodoUser("username", "password",
                "email", TodoUserRole.USER, false, true);
        when(todoUserRepository.save(Mockito.any(TodoUser.class)))
                .thenReturn(exampleUser);

        TodoUser theUser = todoUserService.createUser(exampleUser);

        assertNotNull(todoUserRepository.findById(theUser.getId()));
    }
}
