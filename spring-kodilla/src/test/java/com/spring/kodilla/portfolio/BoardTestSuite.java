package com.spring.kodilla.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        TaskList toBeDone = (TaskList) context.getBean("toDoList");
        TaskList doneTasks = (TaskList) context.getBean("doneList");

        toBeDone.addTask("Zadanie do dokończenia");
        doneTasks.addTask("Ukończone zadanie");

        Board board = context.getBean(Board.class);

        board.readTask();
    }
}
