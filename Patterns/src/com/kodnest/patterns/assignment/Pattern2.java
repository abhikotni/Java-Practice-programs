package com.kodnest.patterns.assignment;
/*
*****
*   *
*   *
*   *
*****
 */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			if(i==1||i==5) {
				for(int j=1;j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=1;j<=5;j++) {
					if(j==1||j==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}	
		}
	}

}
