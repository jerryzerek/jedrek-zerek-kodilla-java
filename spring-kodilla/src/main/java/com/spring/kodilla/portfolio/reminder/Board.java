package com.spring.kodilla.portfolio.reminder;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private List<TaskList> taskLists = new ArrayList<>();
    private String name;

    public Board(String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskLists=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }
}
