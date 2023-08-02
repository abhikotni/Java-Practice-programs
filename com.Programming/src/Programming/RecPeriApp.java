package Programming;

import java.util.Scanner;

public class RecPeriApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		System.out.println("Enter breadth");
		int b = sc.nextInt();
		RecPeri rp = new RecPeri();
		int pr = rp.perimeterRect(l,b);
		System.out.println("Perimeter of Rectangle is "+pr);
		sc.close();
	}
}
