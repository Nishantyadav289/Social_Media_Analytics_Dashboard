package com.app.dashboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.dashboard.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
