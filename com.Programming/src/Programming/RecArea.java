//java program to find the area of rectangle using dedicated method and as per the input entered by the user
package Programming;

import java.util.Scanner;

public class RecArea {

	public static int rectArea(int l, int b) {
		return (l*b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenghth");
		int l = sc.nextInt();
		System.out.println("Enter breadth");
		int b = sc.nextInt();
		int ar = rectArea(l,b);
		System.out.println("Area of Rectangle is "+ar);
		sc.close();
	}

}