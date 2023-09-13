package com.jpa.test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample1Application.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		
		//create object for User
//		User user1 = new User();
//		user1.setName("Salehin");
//		user1.setCity("Mirpur");
//		user1.setStatus("Spring Boot Developer");
//		User user2 = new User();
//		user2.setName("Salehin2");
//		user2.setCity("Mirpur2");
//		user2.setStatus("Spring Boot Developer2");
//		User user3 = new User();
//		user3.setName("Salehin3");
//		user3.setCity("Mirpur3");
//		user3.setStatus("Spring Boot Developer3");
//		
//		List<User> users = List.of(user1,user2,user3);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->{
//		System.out.println(user);
//		});
		
		
		//Update data of User
//		Optional<User> optional= userRepository.findById(304);
//		User user = optional.get();
//		
//		user.setName("Shabab Salehin 3");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
		
		//get the data of User
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user->{System.out.println(user);});
		
		
		//Delete data of user
//		userRepository.deleteById(304);
		
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
		//Custom Finder Method/ Derived Query Method
//		List<User> users = userRepository.findByNameAndCity ("Salehin3", "Mirpur3");
//		users.forEach(e->System.out.println(users));
		

		//Show data through JPQL
//		List<User> userAll = userRepository.getUserAll();
//		userAll.forEach(e->System.out.println(e));
//		
//		List<User> byUserName = userRepository.getByUserName("Salehin", "Mirpur");
//		byUserName.forEach(e->System.out.println(e));
		
		
		//Show data through Native Query
//		List<User> usersAll = userRepository.getUsersAll();
//		usersAll.forEach(e->System.out.println(e));
		
	}

}
