package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given

        //Task to reprezentacja wiersza w javie, stworzyłem sobie wiersz
        Task task = new Task(DESCRIPTION, 7);

        //When
        //Dorzucam stworzyony wiersz do bazy danych
        taskDao.save(task);

        //Then
        //Tutaj odwołuje się do tego co utworzyłem w Javie (1 linijka)
        int id = task.getId();
        Task readTask = taskDao.findById(id).orElse(null);
        Assert.assertEquals(id, readTask.getId());

//        List<Task> taskList = taskDao.findByDuration(7);
//        taskList.forEach(tsk -> System.out.println(tsk.getCreated()));
//
//        List<Task> tasklist2 = taskDao.findByDurationAndId(7,5);
//        tasklist2.forEach(tsk -> System.out.println(tsk.getCreated()));
    }


    @Test
    public void testDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 10);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());
    }
}


