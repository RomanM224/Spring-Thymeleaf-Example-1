package com.maistruk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maistruk.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
