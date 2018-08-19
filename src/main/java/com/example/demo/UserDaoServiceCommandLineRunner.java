package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;
import com.example.demo.services.UserRepository;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		User savedUser = userRepository.save(user);
		
		log.info("New user created "+  savedUser);
	}

}
