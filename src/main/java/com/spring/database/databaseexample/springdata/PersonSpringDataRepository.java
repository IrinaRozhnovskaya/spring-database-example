package com.spring.database.databaseexample.springdata;

import com.spring.database.databaseexample.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
