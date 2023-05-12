package com.example.kodilla_10_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Configuration
public class BoardConfig {
    private TaskList taskList;
    private Book book;
    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList(){
        return new TaskList();
    }
    @Bean
    public TaskList doneList(){
        return new TaskList();
    }
    @Bean
    @Scope("prototype")
    public Board allTasks(){
        return new Board(toDoList(),inProgressList(),doneList());
    }

}
