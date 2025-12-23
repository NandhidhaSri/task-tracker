package com.tasktracker.service;

import com.tasktracker.model.Task;
import java.util.List;

public interface TaskService {
    Task saveTask(Task task);
    List<Task> getAllTasks();
    void deleteTask(Long id);
}