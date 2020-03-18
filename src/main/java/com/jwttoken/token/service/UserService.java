package com.jwttoken.token.service;

import com.jwttoken.token.dao.UserRepo;
import com.jwttoken.token.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User findById(Integer id){
        User user =  userRepo.queryById(id);
        return user;
    }

    public User findByUserName(String userName){
        return userRepo.findByUserName(userName);
    }
}
