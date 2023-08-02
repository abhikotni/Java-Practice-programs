package com.kodnest.patterns.assignment;
/*
 ***
 * *
 ***
 */
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			if(i==1||i==3) {
				for(int j=1;j<=3;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=1;j<=3;j++) {
					if(j==1||j==3) {
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
