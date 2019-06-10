package com.prac;

public class Url {

	private int a;
	private int b;
	private int c;
	  
	public Url(Integer a,Integer b){
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println(c);
		System.out.println(this.c);
	}
	public static void main(String[] args) {
		Url u=new Url(10,12);
		
	}
}
