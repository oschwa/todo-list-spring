package dev.oliver.todobackend.repository;

import dev.oliver.todobackend.entity.TodoAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoAccountRepository extends JpaRepository<TodoAccount, Integer> {
}
