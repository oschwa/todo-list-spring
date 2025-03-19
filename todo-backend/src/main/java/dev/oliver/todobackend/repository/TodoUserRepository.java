package dev.oliver.todobackend.repository;

import dev.oliver.todobackend.entity.TodoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoUserRepository extends JpaRepository<TodoUser, Integer> {
}

