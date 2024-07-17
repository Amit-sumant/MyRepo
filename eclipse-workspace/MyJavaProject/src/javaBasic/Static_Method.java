package javaBasic;

public class Static_Method {

	public static void main(String[] args) 
	{
		Static_Method sm=new Static_Method();
		sm.submit();
		
		sendmail();
		
		newmember();

	}
	
	public void submit()
	{
		int i=10;
		int cnt=0;
		
		cnt = i*10;
		
		System.out.println(cnt);
	}
	
	public static void sendmail()
	{
		System.out.println("Mail Sent to User");
	}
	
	private static void newmember()
	{
		System.out.println("New Member added");
	}
	
}
