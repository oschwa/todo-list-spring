package dev.oliver.todobackend.service.impl;

import dev.oliver.todobackend.entity.TodoUser;
import dev.oliver.todobackend.repository.TodoUserRepository;
import dev.oliver.todobackend.service.TodoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoUserServiceImpl implements TodoUserService {

    private TodoUserRepository todoUserRepository;

    @Autowired
    public TodoUserServiceImpl(TodoUserRepository todoUserRepository) {
        this.todoUserRepository = todoUserRepository;
    }

    @Override
    public List<TodoUser> findAll() {
        return todoUserRepository.findAll();
    }

    @Override
    public TodoUser createUser(TodoUser todoUser) {
        return todoUserRepository.save(todoUser);
    }

    @Override
    public TodoUser findUserById(int id) {
        //TODO: Implement proper error handling.
        return todoUserRepository.findById(id).get();
    }


}
