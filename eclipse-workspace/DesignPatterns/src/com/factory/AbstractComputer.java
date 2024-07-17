package com.factory;

public abstract class AbstractComputer {

	public abstract String getHDD();
	public abstract String getRAM();
	public abstract String getCPU();

	 public String toString() {
		 return "HDD  "+getHDD()+ "   RAM::"+getRAM();
	 }
}
