package com.cognizant.employee_demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import java.util.List;
@SpringBootApplication
public class EmployeeDemoApplication {
	@Autowired
    private EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoApplication.class, args);
	}
	 @PostConstruct
	    public void runAfterStartup() {
	        employeeService.addEmployee(new Employee(3, "Charlie", 82000));
	        List<Employee> allEmployees = employeeService.getAll();
	        allEmployees.forEach(System.out::println);
	    }
}
