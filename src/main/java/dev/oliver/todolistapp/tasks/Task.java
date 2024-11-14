package dev.oliver.todolistapp.tasks;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Task {
    private String date;
    private String title;
    private List<String> description;

    public Task() {}

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public Task(String title, String date, List<String> description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }
}
