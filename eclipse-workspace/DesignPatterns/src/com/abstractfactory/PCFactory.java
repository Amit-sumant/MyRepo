package com.abstractfactory;

public class PCFactory extends AbstractFactory {

	private String hdd;
	private String cpu;
	private String ram;
	
	public PCFactory(String hdd, String cpu, String ram){
		this.hdd = hdd;
		this.cpu=cpu;
		this.ram= ram;
	}

	@Override
	public Computer createComputer() {
		return new PC(hdd,ram,cpu);
	}

	
	
	
}
