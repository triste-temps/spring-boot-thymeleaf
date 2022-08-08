package com.myapp.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.thymeleafdemo.entity.Employee;

// @RepositoryRestResource(path="members")
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
	
	// add a method to sort by last name
	//public List<Employee> findAllByOrderLastNameAsc();

}
