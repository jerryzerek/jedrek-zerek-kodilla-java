package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
        System.out.println("The Person is buying " + whatToBuy);
         return quantity > 10;
    }
}
