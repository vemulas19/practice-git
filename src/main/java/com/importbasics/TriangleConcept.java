package com.importbasics;

public class TriangleConcept {
	
	
	public static void main(String[] args) {
		
		 triangle();
		
	}

	private static void triangle() {
		
		int n=5;
		
		for (int i=0;i<n;i++){
			
			for(int j=n-i;j>1;j--){
				System.out.print(" " +j);
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* " +j);
			}
			System.out.println("  ");
		}
	
	}

}
