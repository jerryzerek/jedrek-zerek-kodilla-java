package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.getTaskInfo(TaskFactory.DRIVING);

        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());

    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.getTaskInfo(TaskFactory.PAINTING);
        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.getTaskInfo(TaskFactory.SHOPPING);
        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
