package edu.se452.group1.ilearn.data.repository;


import edu.se452.group1.ilearn.data.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
