package com.example.demo.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.User;

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



//A persistence context handles a set of entities which hold data to be persisted in some persistence store (e.g. a database). 
//In particular, the context is aware of the different states an entity can have (e.g. managed, detached) in relation to both the context and the underlying persistence store.