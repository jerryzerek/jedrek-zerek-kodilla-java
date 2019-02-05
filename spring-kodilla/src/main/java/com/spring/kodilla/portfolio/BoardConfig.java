package com.spring.kodilla.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDolist;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;


    @Bean
    public Board getBoard() {
        return new Board(toDolist,inProgressList, doneList);
    }


    @Bean (name="toDoList")
    public TaskList getToDoTaskList() {
        return new TaskList();
    }

    @Bean (name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean (name="doneList")
    public TaskList getDoneTaskList() {
        return new TaskList();
    }
}
