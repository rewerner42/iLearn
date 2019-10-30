package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
    List<Parent> findById(long id);
}