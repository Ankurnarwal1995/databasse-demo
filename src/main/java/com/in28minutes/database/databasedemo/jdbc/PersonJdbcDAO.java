package com.in28minutes.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.beans.Person;

@Repository
public class PersonJdbcDAO {
	
	// Select * from person
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll(){
		return jdbcTemplate.query("Select * from person", new BeanPropertyRowMapper<Person>(Person.class));
		
		
	}
	
	

}
