package collectionOfJava;
import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

	public static <E> void main(String[] args) 
	{
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(100);
		ar.add(500);
		ar.add("String");
		
		//to print all the values from arraylist then use for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//generic and non generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(500);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Selenium is great with Java");
		
		/*ArrayList<E> ar4=new ArrayList<E>()*/;
		
		//employee class object
		
		Employee emp=new Employee("Amit",38,"Selenium");
		Employee emp1=new Employee("Ashwini",34,"Java");
		Employee emp2=new Employee("Arnav",8,"Tabla");
		
		// crate an arraylist
		ArrayList<Employee> ar5=new ArrayList<Employee>();
		ar5.add(emp);
		ar5.add(emp1);
		ar5.add(emp2);
		
		//Iterator to traverse the value
		Iterator<Employee> it=ar5.iterator();
		
		while(it.hasNext())
		{
			Employee empe=it.next();
			System.out.println(empe.name +" " + empe.age +" "+ empe.dept);
			//System.out.println(empe.age);
			//System.out.println(empe.dept);
			
		}
		
		//Add All
		System.out.println("******Add All Functionality*******");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Selenium is great with Java");
		ar6.add("Java has OOOP Concepts");
		ar6.add("This is Software Languages");
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("I have to search Job ASAP");
		ar7.add("Hardly 2 to 3 months remaining in CTS");
		ar7.add("Next Company will be last complany");
		
		ar6.addAll(ar7);
		
		for(int i=0; i<ar6.size(); i++)
		{
			System.out.println(ar6.get(i));
		}
		
	}

}
