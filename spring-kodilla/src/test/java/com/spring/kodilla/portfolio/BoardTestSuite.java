package com.spring.kodilla.portfolio;


import com.spring.kodilla.portfolio.reminder.Task;
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
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        TaskList toBeDone = (TaskList) context.getBean("toDoList");
        TaskList inPrgressTasks = (TaskList) context.getBean("inProgressList");
        TaskList doneTasks = (TaskList) context.getBean("doneList");

        toBeDone.addTask("Zadanie do dokończenia");
        inPrgressTasks.addTask("Zadanie w trakcie robienia");
        doneTasks.addTask("Ukończone zadanie");

        //When
        Board board = context.getBean(Board.class);

        //Then
        Assert.assertEquals("Zadanie do dokończenia", toBeDone.getTasks().get(0));
        Assert.assertEquals("Zadanie w trakcie robienia", inPrgressTasks.getTasks().get(0));
        Assert.assertEquals("Ukończone zadanie", doneTasks.getTasks().get(0));
    }
}
