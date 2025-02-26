package dev.oliver.todobackend.dao.impl;

import dev.oliver.todobackend.dao.TodoAccountDAO;
import dev.oliver.todobackend.entity.TodoAccount;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoAccountDAOImpl implements TodoAccountDAO {

    private EntityManager entityManager;

    public TodoAccountDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<TodoAccount> findAll() {
        return null;
    }
}
