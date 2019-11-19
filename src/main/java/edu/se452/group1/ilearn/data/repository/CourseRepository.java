package edu.se452.group1.ilearn.data.repository;


import edu.se452.group1.ilearn.data.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course save(Course course);

    List<Course> findAll();

    Course findById(long id);

    void delete(Course course);
}
