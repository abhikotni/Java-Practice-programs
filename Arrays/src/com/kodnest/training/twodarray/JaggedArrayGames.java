package com.kodnest.training.twodarray;

import java.util.Scanner;

public class JaggedArrayGames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of games");
		int [][]arr = new int[scan.nextInt()][];
		for (int i = 0;i<arr.length;i++) {
			System.out.println("Enter number of players in game "+i);
			arr[i]= new int[scan.nextInt()];
		}
		for (int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the score of player "+j+" of game "+i);
				arr[i][j]=scan.nextInt();
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
