package com.NumberSystem;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		String s,r="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number whether it is palindrome or not");
		
		s = sc.nextLine();
		int length = s.length();
		for (int i = length - 1; i >= 0; i--)
			r = r+s.charAt(i);
		if(s.equals(r))
			System.out.println("number is a palindrome");
		else
			System.out.println("number is not palindrome");
	}

}
