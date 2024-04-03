package com.aloofly.Serializable_Employee.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aloofly.Serializable_Employee.model.Employee;

public class EmployeeController {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee employee= new Employee(23,"Ramesh","Pune", "Kudachi");
	FileOutputStream fos= new FileOutputStream("xyz.txt");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	oos.writeObject(employee);
	System.out.println("Serialization done.......");
	
	//Deserialisation
	FileInputStream fis= new FileInputStream("xyz.txt");
	ObjectInputStream ois= new ObjectInputStream(fis);
	Employee emp2=(Employee) ois.readObject();
	System.out.println(" Deseriazation is done .....");
	
	System.out.println(emp2.getEmpId());
	System.out.println(emp2.getName());
	System.out.println(emp2.getCity());
	System.out.println(emp2.getAddress());
	

	
}
}
