package edu.se452.group1.ilearn.service;

import edu.se452.group1.ilearn.data.entity.Course;
import edu.se452.group1.ilearn.data.entity.Topic;
import edu.se452.group1.ilearn.data.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> findAll() { return topicRepository.findAll(); }

    public Topic findById(long id) { return topicRepository.findById(id); }

    public List<Topic> findByCourse(Course course) { return topicRepository.findByCourse(course);}

}
