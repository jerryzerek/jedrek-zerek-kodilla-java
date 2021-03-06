package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName,final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute task: " + taskName);
    }

    @Override
    public boolean isTaskExecuted() {
        System.out.println("The Person is driving to " + where + " using " + using);
        if (using != "car") {
            return false;
        }
        return true;
    }
}
