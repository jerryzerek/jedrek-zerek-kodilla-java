package com.spring.kodilla.portfolio;


public class Board {
    private TaskList toDoList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList doneList) {
        this.toDoList = toDoList;
        this.doneList = doneList;
    }

    public void readTask() {
        toDoList.getTasks().stream()
                .forEach(System.out::println);

        doneList.getTasks().stream()
                .forEach(System.out::println);
    }


    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
