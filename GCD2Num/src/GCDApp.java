import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.println("The GCD of "+m+" and "+n+" is "+GCD.findGCD(m, n));
		scan.close();
	}

}
