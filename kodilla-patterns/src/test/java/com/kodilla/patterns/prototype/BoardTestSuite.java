package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;


import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //Given
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

        TaskList doneList = new TaskList("Done Tasks");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> doneList.getTasks().add(new Task("Done Task number " + n)));

        Board board = new Board("Project number 1");

        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(doneList);

        System.out.println(board);

        //When
        //Then
        Assert.assertEquals(3, board.getLists().size());

    }
}
