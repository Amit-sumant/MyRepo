package com.abstractfactory;

public class PC extends Computer {

	
	private String hdd;
	private String ram;
	private String cpu;
	
	public PC(String hdd, String ram, String cpu) {
		this.hdd =hdd;
		this.ram = ram;
		this.cpu= cpu;
	}
	
	
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
