package com.example.demo.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Transactional  //for transaction management
@Component		//Defining this as a bean
public class UserDaoService {
	@PersistenceContext
	EntityManager entityManager;
	
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
}



//A transaction is a logical unit of work that contains one or more SQL statements. A transaction is an atomic unit. 
//The effects of all the SQL statements in a transaction can be either all committed (applied to the database) or all rolled back (undone from the database)