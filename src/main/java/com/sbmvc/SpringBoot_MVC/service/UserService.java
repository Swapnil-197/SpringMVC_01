package com.sbmvc.SpringBoot_MVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbmvc.SpringBoot_MVC.pojo.User;
import com.sbmvc.SpringBoot_MVC.repo.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EntityManager entityManager;
	
	public Boolean validateUser(User user) {
		
		Query query = entityManager.createQuery("from User where email =: email AND password = : password");
		query.setParameter("email", user.getEmail());
		query.setParameter("password",user.getPassword());
		
		if(query.getResultList().size() > 0)
			return true ;
		else
			return false ;
	}
}
