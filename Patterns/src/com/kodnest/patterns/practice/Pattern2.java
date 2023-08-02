package com.kodnest.patterns.practice;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++){ 
			for(int j=2*(5-i); j>=0; j--) // inner loop for spaces 
			{           
				System.out.print(" "); // printing space
			} 
			for(int j=0; j<=i; j++) //  inner loop for columns
			{       
				System.out.print("* "); // print star
			}           
			System.out.println(); // ending line after each row
		} 
	}

}
