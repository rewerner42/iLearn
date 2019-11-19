package edu.se452.group1.ilearn.service;

import edu.se452.group1.ilearn.data.entity.Course;
import edu.se452.group1.ilearn.data.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course save(Course course) { return courseRepository.save(course);}

    public List<Course> findAll() { return courseRepository.findAll(); }

    public Course findById(long id) { return courseRepository.findById(id); }

    public void deleteById(long id) { courseRepository.deleteById(id);}
}
