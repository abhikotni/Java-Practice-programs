package com.kodnest.training.threedarray;

import java.util.Scanner;

public class JaggesThreeDSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Schools ");
		int [][][]arr = new int[scan.nextInt()][][];
		//Hard Coding of bounds of 2nd dimension and 3rd dimension of array
		/*arr[0]=new int[3][];
		arr[1]=new int[2][];
		arr[2]=new int[4][];
		arr[0][0]= new int[3];
		arr[0][1]= new int[4];
		arr[0][2]= new int[2];
		arr[1][0]= new int[4];
		arr[1][1]= new int[3];
		arr[2][0]= new int[2];
		arr[2][1]= new int[3];
		arr[2][2]= new int[1];
		arr[2][3]= new int[2];*/
		// to reduce the code redenduncy 
		/*for (int i = 0;i<arr.length;i++) {
			System.out.println("Enter the number of classes in School "+i);
			arr[i]=new int[scan.nextInt()][];
		}
		*/
		for (int i = 0;i<arr.length;i++) {
			System.out.println("Enter the number of classes in School "+i);
			arr[i]=new int[scan.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the number of Students in class "+j+" in School "+i);
				arr[i][j]= new int[scan.nextInt()];
			}
		}
		for (int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student "+k+" of class "+j+" of school "+i);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array Contents Are");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("----------------------------------");
		}
		scan.close();


	}

}
