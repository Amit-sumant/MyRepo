package com.abstractfactory;

public class Client {

	public static void main(String[] args) {
		Computer pc =ComputerFactory.getComputer(new PCFactory("12 GB", "Intel5i", "500GB"));

	}

}
