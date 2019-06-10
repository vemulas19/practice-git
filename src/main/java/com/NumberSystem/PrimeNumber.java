package com.NumberSystem;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num,l;
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ant integer value");
		num = sc.nextInt();
		
		for(l=2;l<=(num/2);l++) {
			if(num%l==0){
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println(num +"is a prime number");
		else
			System.out.println(num +"is not aprime number ");
<<<<<<< HEAD

		    System.out.println("num");
		System.out.println("prashanth committed");
=======
>>>>>>> refs/heads/master
	}

}
