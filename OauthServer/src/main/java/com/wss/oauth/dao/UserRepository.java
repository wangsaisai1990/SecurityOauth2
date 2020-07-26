package com.wss.oauth.dao;

import com.wss.oauth.entity.User;

public interface UserRepository {

    User findByUsername(String username);
}