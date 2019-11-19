package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}
