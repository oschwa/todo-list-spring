package dev.oliver.todobackend.dao;

import dev.oliver.todobackend.entity.TodoAccount;
import java.util.List;

public interface TodoAccountDAO {

    List<TodoAccount> findAll();
}
