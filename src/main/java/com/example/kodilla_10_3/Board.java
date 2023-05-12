package com.example.kodilla_10_3;

import org.springframework.context.annotation.Bean;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
    public void getAll(){
        System.out.println("\nZadania do wykonania: " + toDoList.getTasks() + "\nZadania w trakcie: " + getInProgressList().getTasks() + "\nZadania wykonane: " + getDoneList().getTasks());
    }
}
