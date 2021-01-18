package com.hcl.taskmanager.data.service;

import java.util.List;
import com.hcl.taskmanager.data.abstraction.TaskDao;
import com.hcl.taskmanager.exception.TaskNotFoundException;
import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService implements TaskDao {

    @Autowired
    private TaskRepository repository;

    public void createTask(String taskName, String startDate, String endDate,
            String description, String severity) {
        Task task = new Task(taskName, startDate, endDate, description, severity);
        Task.addTask(task);
        repository.save(task);
    }

    @Override
    public void createTask(Task task) {
        createTask(task.getTaskName(), task.getStartDate(), task.getEndDate(),
                task.getDescription(), task.getSeverity());
    }

    @Override
    public void deleteTask(Task task) {
        Task.removeTask(task);
        repository.deleteById(task.getId());
    }

    @Override
    public void updateTask(Task task) {
        if(repository.existsById(task.getId())) {
            repository.save(task);
        } else {
            throw new TaskNotFoundException(task.getId());
        }
    }

    @Override
    public List<Task> displayTasks() {
        // TODO Auto-generated method stub
        return null;
    }
}
