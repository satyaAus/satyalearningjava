package com.sep29.main;

import com.sep29.classes.*;

public class Sep29Main {

	public static void main(String[] args) {
		HelloJava helloJavaObject = new HelloJava();
		//static method
		HelloJava.sayHello();
		//instance method
		helloJavaObject.sayHello("babbe");
		
		Greetings _greetings;
		_greetings = new Greetings();
		_greetings.sayHello("Hareesh");
		_greetings.sayHello("chinese");
	}

}
