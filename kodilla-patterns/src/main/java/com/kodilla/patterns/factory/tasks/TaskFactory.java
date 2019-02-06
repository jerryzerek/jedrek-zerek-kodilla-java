package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String SHOPPING = "SHOPPING TASK";

    public Task getTaskInfo (final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Task for shopping", "bread", 12.5);
            case PAINTING:
                return new PaintingTask("Task for painting", "Black", "wall");
            case DRIVING:
                return new DrivingTask("Task for driving", "Radom", "car");
            default:
                return null;
        }
    }
}
