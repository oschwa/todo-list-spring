package dev.oliver.todobackend.dao;

import dev.oliver.todobackend.dao.impl.TodoAccountDAOImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class TodoAccountDAOTests {

    @Autowired
    private TodoAccountDAOImpl todoAccountDAO;

    @Test
    public void accountDAONotNullTest() {
        Assertions.assertNotNull(todoAccountDAO);
    }
}
