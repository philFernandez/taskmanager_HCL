package com.hcl.taskmanager.data.abstraction;

import java.util.List;
import com.hcl.taskmanager.model.Task;

public interface TaskDao {
    void createTask(Task task);
    void deleteTask(String taskId);
    void updateTask(Task task);
    List<Task> displayTasks();
}
