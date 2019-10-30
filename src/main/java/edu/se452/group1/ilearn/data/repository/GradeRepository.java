package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByStudentId(long studentId);
}
