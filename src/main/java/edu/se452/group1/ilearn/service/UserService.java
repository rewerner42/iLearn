package edu.se452.group1.ilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.se452.group1.ilearn.data.repository.UserRepository;
import edu.se452.group1.ilearn.domain.UserRegistration;


@Service
public class UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
/** 
    public List<UserRegistration> getNewUserAccount()
*/
}