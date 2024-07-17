package com.singletone;

public class TestSingleTone {

	final public static void main(String[] args) {

		SingleToneClass obj = SingleToneClass.getInstance();
		SingleToneClass obj1 = SingleToneClass.getInstance();

		System.out.println(obj.toString());
		System.out.println(obj1.toString());

	}

}
