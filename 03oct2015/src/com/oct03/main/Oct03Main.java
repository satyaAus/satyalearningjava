package com.oct03.main;

import com.oct03.classes.*;

public class Oct03Main {

	public static void main(String[] args) {
		System.out.println("starting");
		
		//calling the method
		VariableDemo.setNumber(10);
		//calling the method
		VariableDemo.displayNumber();
		
		VariableDemo.setNumber(20000);
		VariableDemo.displayNumber();
		
		//calling the method
		VariableDemo.displayAllVariables();

	}

}
