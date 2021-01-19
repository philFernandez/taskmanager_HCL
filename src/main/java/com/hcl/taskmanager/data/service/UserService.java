package com.hcl.taskmanager.data.service;

import com.hcl.taskmanager.data.abstraction.UserDao;
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
        repository.save(user);
    }

    @Override
    public boolean authenticate(User user) {
        return false;
    }
    
}
