package com.doc.mavendocker.service;

import com.doc.mavendocker.model.User;
import com.doc.mavendocker.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        return userRepository.save(newUser);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }
}
