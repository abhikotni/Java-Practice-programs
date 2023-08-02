package com.kodnest.patterns.practice;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a  4 letter string to be printed");
		String input = sc.next();
		for(int i=1;i<=4;i++) 
		{
			for(int j=4;j>=i;j--) 
			{
			System.out.print(" ");	
			}
			for (int k = i * 2 - 1; k >= 1; k--)
	        {
	            System.out.print(input.charAt(i - 1));
	        }
			System.out.println();
		}
		sc.close();
	}
}
