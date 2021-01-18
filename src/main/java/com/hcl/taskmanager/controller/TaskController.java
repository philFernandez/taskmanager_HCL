package com.hcl.taskmanager.controller;

import com.hcl.taskmanager.data.service.TaskService;
import com.hcl.taskmanager.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
