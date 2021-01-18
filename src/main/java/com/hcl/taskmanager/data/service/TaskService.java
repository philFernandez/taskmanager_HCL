package com.hcl.taskmanager.data.service;

import java.util.List;
import com.hcl.taskmanager.data.abstraction.TaskDao;
import com.hcl.taskmanager.exception.TaskNotFoundException;
import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskDao {

    @Autowired
    private TaskRepository repository;

    public void createTask(String taskName, String startDate, String endDate,
            String description, String severity) {
        Task task = new Task(taskName, startDate, endDate, description, severity);
        repository.save(task);
    }

    @Override
    public void createTask(Task task) {
        createTask(task.getTaskName(), task.getStartDate(), task.getEndDate(),
                task.getDescription(), task.getSeverity());
    }

    @Override
    public void deleteTask(String taskId) {
        deleteTask(Long.valueOf(taskId));
    }

    public void deleteTask(Long taskId) {
        repository.deleteById(taskId);
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
        List<Task> tasks = repository.findAll();
        return tasks;
    }
}
