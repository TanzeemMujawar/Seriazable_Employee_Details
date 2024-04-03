package com.aloofly.Serializable_Employee.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String name;
	private String city;
	private String address;

	public Employee(int empId, String name, String city, String address) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
