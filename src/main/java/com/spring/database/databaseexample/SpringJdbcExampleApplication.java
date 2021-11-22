package com.spring.database.databaseexample;

import com.spring.database.databaseexample.entity.Person;
import com.spring.database.databaseexample.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcExampleApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao jdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    log.info("All users -> {}", jdbcDao.findAll());
	    log.info("User with id=10001 -> {}", jdbcDao.findById(10001));
	    log.info("User with name=Irina -> {}", jdbcDao.findByName("Irina"));
	    log.info("User with location=New York -> {}", jdbcDao.findByLocation("New York"));
//	    log.info("Deleting 10004 -> No of rows deleted - {}", repository.deleteById(10004));
//	    log.info("Deleting with name=Hanna and location=London  -> No of rows deleted - {}",
//                repository.deleteByNameAndLocation("Hanna", "London" ));
	    log.info("Deleting with name=Hanna or location=New York  -> No of rows deleted - {}",
                jdbcDao.deleteByNameOrLocation("Hanna", "New York" ));
        log.info("Inserting 10005 -> {}", jdbcDao.insert(new Person(10005, "Mary", "Lviv", new Date())));
        log.info("Updating 10004 -> {}", jdbcDao.insert(new Person(10004, "Hanna", "Los Angeles", new Date())));
	}
}
