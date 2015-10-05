package com.oct03.classes;

//class
public class VariableDemo {
	
	//variables
	private static int _number;
	private static char _character = 'a';
	
	//static method int number is a incoming paramater
	public static void setNumber(int number){
		_number = number;
	}
	
	//static method
	public static void displayNumber(){
		System.out.printf("\nNumber: %d", _number);
	}
	
	public static void displayAllVariables(){
		System.out.printf("\n This is character: %c", _character);
		System.out.printf("\nNumber: %d",_number);
		
	}
}
