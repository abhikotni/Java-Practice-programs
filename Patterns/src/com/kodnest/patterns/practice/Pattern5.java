package com.kodnest.patterns.practice;

public class Pattern5 {
	public static void main(String[] args) {
		int a=0;
		for(int i=3;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
				
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
