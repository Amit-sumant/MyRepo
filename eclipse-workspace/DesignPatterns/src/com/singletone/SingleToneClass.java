package com.singletone;

public class SingleToneClass {
	
	private static SingleToneClass instance;
	private SingleToneClass() {}
	

	public static SingleToneClass getInstance() {
		
		if(instance == null) {
			synchronized (SingleToneClass.class) {
				if(instance == null) {
					instance =new SingleToneClass();
				}
				
			}
		}
		 
		return instance;
	}
	public static void  main(String[] args) {
		
		System.out.println("Test");
	}

}
