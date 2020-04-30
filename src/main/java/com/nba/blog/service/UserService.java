package com.nba.blog.service;

import com.nba.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
