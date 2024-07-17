package com.java.General;

public class MultipleVars {
	
	final int num = 10;
	
	public void display() {
		int num =15;
		
		Runnable r = new Runnable() {

			final int num = 20;
			public void run() {
				int num = 25;
				
				System.out.println(this.num);
				
			}
			
		};
		
		r.run();
	}
	
	public static void main(String[] args) {
		MultipleVars obj = new MultipleVars();
		obj.display();
	}

}
