package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeePrototype implements Cloneable {

	
	List<String> empList;
	
	public List<String> getEmpList() {
		return empList;
	}

	
	public EmployeePrototype(List<String> empList){
		this.empList = empList;
	}
	
	public EmployeePrototype(){
		this.empList = new ArrayList<>();
	}
	
	
	public void loadData() {
		empList.add("Ashwini");
		empList.add("Arnav");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> empListTemp = new ArrayList<>();
		this.empList.forEach(n->empListTemp.add(n));
		EmployeePrototype object =  new EmployeePrototype(empListTemp);
		
		return object;
		
		
	}
	

}
