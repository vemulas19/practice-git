package com.prac;

public class Url {

	private int a;
	private int b;
	static int c;
	public Url(Integer a,Integer b){
		this.a=a;
		this.b=b;
		c=a+b;
	}
	public static void main(String[] args) {
		Url u=new Url(10,12);
		System.out.println(c);
	}
}
