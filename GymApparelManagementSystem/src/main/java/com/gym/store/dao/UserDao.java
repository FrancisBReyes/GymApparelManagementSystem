package com.gym.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.store.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
