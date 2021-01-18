package com.hcl.taskmanager.model;

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
}
