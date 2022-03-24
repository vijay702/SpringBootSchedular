package com.eminds.schedular.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.eminds.schedular.model.User;
import com.eminds.schedular.repo.UserRepository;

@Service
public class UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Scheduled(fixedRateString = "PT15S")
	public void saveUser() {
		
		User user = new User();
		user.setName("user" + new Random().nextInt(3744483));
		userRepository.save(user);
		System.out.println("saving user " + new Date().toString());
		
		
	}
	
	@Scheduled(fixedRateString = "PT1M" )
	public void fetchUser() {
		
		List<User> users = userRepository.findAll();
		System.out.println("getting user's details " + new Date().toString());
		System.out.println("no of user detail fetch" + users.size());
		LOGGER.info("users : {}", users);
		
		
		
	}
	
	
	

}
