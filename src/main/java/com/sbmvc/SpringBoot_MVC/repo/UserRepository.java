package com.sbmvc.SpringBoot_MVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbmvc.SpringBoot_MVC.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
