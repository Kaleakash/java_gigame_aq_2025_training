package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//		Employee emp1 = new Employee(100, "John", 45000);
//		
//		System.out.println(emp1);
//		FileOutputStream fos = new FileOutputStream("employee.ser");
//		ObjectOutputStream oos =new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
//		System.out.println("object serialization done successfully");
//		oos.close();
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp2 = (Employee)obj;
		System.out.println(emp2);
		System.out.println("object de-serialization done");

		ois.close();
	}

}
