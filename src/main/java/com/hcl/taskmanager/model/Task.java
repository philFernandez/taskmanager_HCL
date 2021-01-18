package com.hcl.taskmanager.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Task {
    private final static List<Task> tasks = new ArrayList<>();
    private @Id @GeneratedValue Long id;
    private String taskName;
    private String startDate;
    private String endDate;
    private String description;
    private String severity;

    public Task(String taskName, String startDate, String endDate, String description,
            String severity) {
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.severity = severity;
    }

    public static boolean addTask(Task task) {
        return tasks.add(task);
    }

    public static boolean removeTask(Task task) {
        return tasks.remove(task);
    }
    
}
