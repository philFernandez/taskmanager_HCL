package com.hcl.taskmanager.data.service;

import java.util.Optional;
import com.hcl.taskmanager.data.abstraction.UserDao;
import com.hcl.taskmanager.exception.NoSuchUserException;
import com.hcl.taskmanager.exception.UserNameNotAvailableException;
import com.hcl.taskmanager.model.User;
import com.hcl.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDao {

    @Autowired
    private UserRepository repository;

    public void register(String userName, String password, String email) {
        User user = new User(userName, password, email);
        register(user);
    }

    @Override
    public void register(User user) {
        if(repository.findById(user.getUserName()).isPresent()) {
            throw new UserNameNotAvailableException(user.getUserName());
        } else {
            repository.save(user);
        }
    }

    @Override
    public boolean authenticate(User user) {
        Optional<User> userLoggingIn = repository.findById(user.getUserName());
        if(userLoggingIn.isPresent()) {
            return user.getPassword().equals(userLoggingIn.get().getPassword());
        } else {
            throw new NoSuchUserException(user.getUserName());
        }
    }
    
}
