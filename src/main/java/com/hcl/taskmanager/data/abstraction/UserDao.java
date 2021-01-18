package com.hcl.taskmanager.data.abstraction;

import com.hcl.taskmanager.model.User;

public interface UserDao {
    void register(User user);
    boolean authenticate(User user);
}
