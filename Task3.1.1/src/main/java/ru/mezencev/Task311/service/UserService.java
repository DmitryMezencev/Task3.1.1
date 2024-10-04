package ru.mezencev.Task311.service;


import ru.mezencev.Task311.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
