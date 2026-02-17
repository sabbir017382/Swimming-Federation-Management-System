package com.project.bd.error.service;

import com.project.bd.error.model.User;
import com.project.bd.error.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User registration(User user)
    {

        return userRepository.save(user);
    }

    public List<User> getAll()
    {
       return userRepository.findAll();
    }
    public User findWithEmail(String email){
        if(userRepository.findByEmail(email).isPresent()){
            return userRepository.findByEmail(email).get();
        }
        return null;
    }
}
