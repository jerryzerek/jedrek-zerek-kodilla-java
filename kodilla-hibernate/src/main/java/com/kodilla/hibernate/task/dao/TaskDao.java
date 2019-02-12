package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);

//    List<Task> findByDurationAndId(int duration, int id);

//    @Query("select Task.created from Task")
//    List<Task> mojeTaski();
}

//public class TaskDaoImpl implements TaskDao {
//
//    @Override
//    public List<Task> findByDuration(int duration) {
//        return null;
//    }
//
//    @Override
//    public <S extends Task> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Task> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Task> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Task> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Task> findAllById(Iterable<Integer> integers) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(Task entity) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Task> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}