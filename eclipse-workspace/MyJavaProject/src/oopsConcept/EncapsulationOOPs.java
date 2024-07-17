package oopsConcept;

public class EncapsulationOOPs 
{
	
	//how to implement encapsulation
	//1.-> Private data variable. so these variables cannot access directly from outside the class
	//2.-> getter and setter method to get and set value
	//Is a concept by which we can perform a single action in different ways.
	
	private int empno;
	private String ename;
	private int eage;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public static void main(String[] args) 
	{
		EncapsulationOOPs oop=new EncapsulationOOPs();
		oop.setEmpno(19);
		oop.setEname("AAA");
		oop.setEage(35);
		
		System.out.println("Employee Number is -> " + oop.empno + " " + "Emp name is -> " + oop.ename + " " + "Emp age is -> " + oop.eage);
		

	}

}
