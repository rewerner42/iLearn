package edu.se452.group1.ilearn.service;

import edu.se452.group1.ilearn.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.se452.group1.ilearn.data.repository.UserRepository;

import java.util.List;


@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll(){ return userRepository.findAll(); }

}