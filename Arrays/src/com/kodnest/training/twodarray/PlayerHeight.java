package com.kodnest.training.twodarray;

import java.util.Scanner;

public class PlayerHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float arr[][] = new float[4][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the height of game "+i+" player "+j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array Contents Are");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
