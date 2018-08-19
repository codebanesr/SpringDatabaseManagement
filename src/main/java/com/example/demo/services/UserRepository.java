package com.example.demo.services;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

// we didnot need to define this one as a component even though we injected it in CommandLineRunner
// why??


// If you see the declaration of JpaRepository it is annotated with @NoRepositoryBean because this is an interface and if you declare it as a bean then JPA will try creating 
// an instance of it and that will throw an error because you cannot have an instance of an interface
public interface UserRepository extends JpaRepository<User, Long>{
	
}
