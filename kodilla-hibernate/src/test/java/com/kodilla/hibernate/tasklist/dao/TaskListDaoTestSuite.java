package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;


    @Test
    public void testFindByLastName() {
        //Given
        TaskList tasklist = new TaskList("inProgress", "Tasklist that contains tasks in progress");
        taskListDao.save(tasklist);

        //When
        String taskListName = tasklist.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(taskListName);

        //Then
        Assert.assertEquals(1, readTaskList.size());



    }

}
