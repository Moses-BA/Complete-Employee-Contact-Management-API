package com.ltp.contacts.service;

import com.ltp.contacts.pojo.User;

public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User saveUser(User user);
    void deleteUser(Long id);
}