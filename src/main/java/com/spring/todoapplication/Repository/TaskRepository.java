package com.spring.todoapplication.Repository;

import com.spring.todoapplication.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findAllByName(String name);

    List<Task> findAllByUsername(String username);
}
