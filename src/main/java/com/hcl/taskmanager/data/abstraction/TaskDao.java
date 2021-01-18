package com.hcl.taskmanager.data.abstraction;

import java.util.List;
import com.hcl.taskmanager.model.Task;

public interface TaskDao {
    void createTask(Task task);
    Task readTask(String taskId);
    void updateTask(Task task);
    void deleteTask(String taskId);
    List<Task> displayTasks();
}
