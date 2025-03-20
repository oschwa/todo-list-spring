package dev.oliver.todobackend.service;

import dev.oliver.todobackend.repository.TodoUserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class TodoUserServiceTests {

    @Mock
    private TodoUserRepository todoUserRepository;

    @InjectMocks
    private TodoUserService todoUserService;

    @Test
    public void contextLoadsRepository() {
        assertNotNull(todoUserRepository);
    }
}
