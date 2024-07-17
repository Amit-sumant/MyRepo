package com.abstractfactory;

public class ComputerFactory {
	
	public static Computer getComputer(AbstractFactory factory) {
		return factory.createComputer();
	};

}
