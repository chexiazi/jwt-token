package com.jwttoken.token.dao;

import com.jwttoken.token.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepo extends JpaRepository<User,Integer> {

    @Query("select m from User m where m.userName = ?1")
    public User findByUserName(String userName);

    @Query("select m from User m where m.id = ?1")
    public User queryById(Integer id);
}
