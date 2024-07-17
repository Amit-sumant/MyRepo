package javaBasic;

public class Multiple_Inheritance 
{
	

	public static void main(String[] args) 
	{
		connection cnt=new connection();
		cnt.connection_prog();
		cnt.frontend();
		cnt.java_configure();

	}

}

class server
{
	void frontend()
	{
		System.out.println("Frontend connection established");
	}
}

class Java extends server
{
	void java_configure()
	{
		System.out.println("Java configured");
	}
}

class connection extends Java
{
	void connection_prog()
	{
		System.out.println("Connection to Programming");
	}
}
