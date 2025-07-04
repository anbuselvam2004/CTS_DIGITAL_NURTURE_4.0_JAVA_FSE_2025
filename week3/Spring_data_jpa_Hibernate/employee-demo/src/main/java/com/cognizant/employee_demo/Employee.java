package com.cognizant.employee_demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	 @Id
	    @Column(name = "id")
	    private int id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "salary")
	    private double salary;

}
