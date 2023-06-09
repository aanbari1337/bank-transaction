package com.aanbari.userservice.service;

import com.aanbari.userservice.exception.UserNotFoundException;
import com.aanbari.userservice.model.User;
import com.aanbari.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
    public User getUserById(int id) throws UserNotFoundException {

        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()) {
            throw new UserNotFoundException("User not found with ID: " + id);
        }

        return user.get();
    }
    public void deleteUser(int id){
         userRepository.deleteById(id);
    }
}
