package com.example.kodilla_10_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

@SpringBootTest
class BoardTestSuite{
    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);
    @Test
    void testVoid(){
        board.getDoneList().addTask("Zadanie1");
        board.getInProgressList().addTask("Zadanie2");
        board.getAll();
        board.getDoneList().removeTask("Zadanie1");
        board.getAll();
    }
    @Test
    void testTaskAdd(){
        board.getDoneList().addTask("Zadanie1");
        ArrayList<String> arrayForTest = new ArrayList<>();
        arrayForTest.add("Zadanie1");
        Assertions.assertEquals(board.getDoneList().getTasks(), arrayForTest);
    }
    @Test
    void testTaskRemove(){
        board.getDoneList().addTask("Zadanie1");
        board.getDoneList().removeTask("Zadanie1");
        ArrayList<Board> emptyList = new ArrayList<>();
        Assertions.assertEquals(board.getDoneList().getTasks(),emptyList);
    }
}