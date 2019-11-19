package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Course;
import edu.se452.group1.ilearn.data.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    Topic findById(long id);

    List<Topic> findAll();

    List<Topic> findByCourse(Course course);
}
