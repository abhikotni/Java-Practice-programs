package Programming;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the operation to be performed from these operators (+,-,*,/,%)");
		char o = sc.next().charAt(0);
		if (o== '+') {
			System.out.println("The addition of two numbers is "+cal.add(a, b));
		}
		else if (o== '-') {
			System.out.println("The difference of two numbers is "+cal.diff(b, a));
		}
		else if (o== '*') {
			System.out.println("The multiplication of two numbers is "+cal.mul(b, a));
		}
		else if (o== '/') {
			System.out.println("The division of two numbers is "+cal.div(b, a));
		}
		else if (o== '%') {
			System.out.println("The remainder of two numbers is "+cal.mod(b, a));
		}
		else {
			System.out.println("Enter the valid operator");
		}
		sc.close();
	}
}
