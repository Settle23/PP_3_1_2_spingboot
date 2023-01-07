package com.osipov.spingboot.service;

import com.osipov.spingboot.model.User;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Object getUserById(long id);

    void addUser(User user);

    void removeUser(long id);

    void updateUser(@Valid User user);
}
