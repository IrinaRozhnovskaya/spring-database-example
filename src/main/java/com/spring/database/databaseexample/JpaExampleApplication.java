package com.spring.database.databaseexample;

import com.spring.database.databaseexample.entity.Person;
import com.spring.database.databaseexample.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JpaExampleApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    log.info("User with id=10001 -> {}", repository.findById(10001));
        log.info("Inserting -> {}", repository.insert(new Person("Mary", "Lviv", new Date())));
        log.info("Updating 10004 -> {}", repository.update(new Person(10004, "Hanna", "Los Angeles", new Date())));
        repository.deleteById(10004);
        log.info("All users -> {}", repository.findAll());
	}
}
