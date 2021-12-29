package com.springboot.restdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restdemo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
