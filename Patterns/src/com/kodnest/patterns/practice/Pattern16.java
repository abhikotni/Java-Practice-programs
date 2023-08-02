package com.kodnest.patterns.practice;

public class Pattern16 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) 
		{
			int ch =65;
			for(int j=1;j<=i;j++) 
			{
			System.out.print(" ");	
			}
			for(int k=5;k>=i;k--)
			{
				
				System.out.print((char)(ch++)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) 
		{
			int ch =65;
			for(int j=1;j<=i;j++) 
			{
			System.out.print(" ");	
			}
			for(int k=5;k>=i;k--) 
			{
				System.out.print((char)(ch++)+" ");
			}
			System.out.println();
		}
	}
}
