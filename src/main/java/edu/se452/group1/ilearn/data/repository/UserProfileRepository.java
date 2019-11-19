package edu.se452.group1.ilearn.data.repository;

import edu.se452.group1.ilearn.data.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByType(String type);
}
