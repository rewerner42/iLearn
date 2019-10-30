package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    Assignment findById(long id);
}

