package edu.se452.group1.ilearn.data.repository;


import edu.se452.group1.ilearn.data.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClassRepository extends JpaRepository<Classes, Long> {
    Classes findById(long id);
}
