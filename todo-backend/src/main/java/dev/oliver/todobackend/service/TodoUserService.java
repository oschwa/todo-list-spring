package dev.oliver.todobackend.service;

import dev.oliver.todobackend.entity.TodoUser;

import java.util.List;

public interface TodoUserService {
    List<TodoUser> findAll();

    TodoUser createUser(TodoUser todoUser);

    TodoUser findUserById(int id);
}

