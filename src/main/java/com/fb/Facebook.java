package com.fb;

public class Facebook {
	static void method1(){
  System.out.println("m1");
}

	static void method2(){
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		method1();
		method2();
		
		System.out.println("main endend");
	}
}