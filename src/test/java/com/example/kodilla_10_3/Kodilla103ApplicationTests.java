package com.example.kodilla_10_3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class BoardTestSuite{
    @Test
    void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().addTask("Zadanie1");
        board.getInProgressList().addTask("Zadanie2");
        board.getAll();
        board.getDoneList().removeTask("Zadanie1");
        board.getAll();
    }
}