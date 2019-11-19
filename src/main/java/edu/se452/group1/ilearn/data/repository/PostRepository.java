package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
