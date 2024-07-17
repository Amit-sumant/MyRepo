package com.factory;

public class PCFactory {

	
	public static AbstractComputer getComputer(String type, String hdd, String cpu, String ram) {
		
		AbstractComputer result=null; 
		if("PC".equalsIgnoreCase(type)) {
			result = new PC(hdd,ram,cpu);
		}
		return result;
		
	}
	public static void main(String[] args) {
		AbstractComputer instance= PCFactory.getComputer("PC", "500GB", "IntelCorei5", "16GB");
		
		System.out.println(instance.toString());

	}

}
