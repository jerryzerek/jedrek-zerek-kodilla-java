package com.spring.kodilla.portfolio.reminder;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class BoardTestSuiteReminder {
    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("developer2", "Roland Bridge");

        Task task1 = new Task("Microservice task",
                "very complicated task that can be divided into easy steps",
                user1,
                user2,
                LocalDate.now().minusDays(30),
                LocalDate.now().plusDays(20));

        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));

        TaskList toDoList = new TaskList("To do");
        toDoList.addTask(task1);

        TaskList doneList = new TaskList("Done");
        doneList.addTask(task2);

        Board project = new Board("Weather Prediction Project");
        project.addTaskList(toDoList);
        project.addTaskList(doneList);

        return project;
    }

    @Test
    public void testAddTaskList() {
        Board project = prepareTestData();
        Assert.assertEquals(2, project.getTaskLists().size());
    }
}
