package com.hcl.taskmanager.controller;

import com.hcl.taskmanager.data.service.TaskService;
import com.hcl.taskmanager.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/create")
    public ModelAndView newTask() {
        return new ModelAndView("newTask", "task", new Task());
    }

    @PostMapping("/create")
    public String saveNewTask(@ModelAttribute Task task) {
        taskService.createTask(task);
        return ("redirect:/task/tasks");
    }

    @GetMapping("/tasks")
    public ModelAndView allTasks() {
        return new ModelAndView("tasks", "taskList", taskService.displayTasks());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
        return ("redirect:/task/tasks");
    }
}
