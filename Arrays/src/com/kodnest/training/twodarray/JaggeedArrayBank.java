package com.kodnest.training.twodarray;
import java.util.Scanner;

public class JaggeedArrayBank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of banks");
		String [][]arr = new String[scan.nextInt()][];
		for (int i = 0;i<arr.length;i++) {
			System.out.println("Enter number of customers in bank "+i);
			arr[i]= new String[scan.nextInt()];
		}
		for (int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of customer "+j+" of bank"+i);
				arr[i][j]=scan.next();
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
