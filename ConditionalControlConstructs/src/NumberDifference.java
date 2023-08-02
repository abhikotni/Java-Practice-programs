import java.util.Scanner;

public class NumberDifference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c;
		if(a>b) {
			c = b - a;
		}
		else {
			c = a - b;
		}
		System.out.println("The negative difference between two numbers is "+c);
		scan.close();
	}
}
