package com.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeePrototype obj= new EmployeePrototype();
		obj.loadData();
		
		EmployeePrototype obj1=(EmployeePrototype) obj.clone();
		
		System.out.println(obj1.getEmpList().toString());

	}

}
