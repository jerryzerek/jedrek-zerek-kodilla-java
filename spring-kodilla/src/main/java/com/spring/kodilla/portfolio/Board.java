package com.spring.kodilla.portfolio;


public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void readTask() {
        toDoList.getTasks().stream()
                .forEach(System.out::println);

        inProgressList.getTasks().stream()
                .forEach(System.out::println);

        doneList.getTasks().stream()
                .forEach(System.out::println);
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
}
