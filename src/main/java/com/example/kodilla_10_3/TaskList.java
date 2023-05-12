package com.example.kodilla_10_3;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

}
