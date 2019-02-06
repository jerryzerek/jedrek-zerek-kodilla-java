package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName,final String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        System.out.println("The Person is painting " + whatToPaint + " with color " + color);
        if (color == "Black") {
            return true;
        }
        return false;
    }



}
