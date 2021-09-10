package com.olive.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olive.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
