package com.kodnest.patterns.assignment;
/*   *
 	* *
   *****
   *****
   *   *
   *   *
   *   *
   *****
*/
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			for(int i=1;i<=3;i++) {
				if(i==1) {
					for(int j=1;j<=2;j++) {
						System.out.print(" ");
					}
					System.out.println("*");
				}
				else if(i==2) {
					for(int j=1;j<=2;j++) {
						System.out.print(" *");
					}
					System.out.println();
				}
				else {
					for(int j=1;j<=5;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
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
