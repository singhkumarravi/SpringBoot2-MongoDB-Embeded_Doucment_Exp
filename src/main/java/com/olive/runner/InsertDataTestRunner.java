package com.olive.runner;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Address;
import com.olive.model.Education;
import com.olive.model.Employee;
import com.olive.repo.EmployeeRepo;
@Component
public class InsertDataTestRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepo repo;

	public void run(String... args) throws Exception {
		repo.deleteAll();

		repo.save(new Employee(101, "Ravi", 10.0,
				new Address("8/10h", "SR Nager", "Hyd"),
				Arrays.asList(
						new Education("High School", "A+", 500, 2011),
						new Education("Integer", "A+", 400, 2013),
						new Education("BSc", "A+", 500, 2026))
				));


		repo.findAll().forEach(System.out::println);
	}

}
