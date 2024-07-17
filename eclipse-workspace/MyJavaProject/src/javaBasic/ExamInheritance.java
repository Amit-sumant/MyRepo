package javaBasic;

public class ExamInheritance 
{
	String str;
	
	public void ABC()
	{
		this.str = "Inheritance";
	}
}

class exam1 extends ExamInheritance
{
	int i=1;
	
	public int getNumber()
	{
		return i;
	}
}

