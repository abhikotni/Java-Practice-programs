import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello user, Welcome to KodNest Calculator");
		int a;
		int b;
		while(true) {
			System.out.println("+ ----> addition \n- ----> subtraction \n* ----> multiplication \n/ ----> division \n% ----> find Remainder \n^ ----> find Square \n! ----> stop");
			System.out.println("Enter your choice");
			char opt = scan.next().charAt(0);
			switch (opt) {
			case '+' :
				System.out.println("Enter the numbers");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("The sum of two numbers is "+Calculator.addition(a, b));
				break;
			case '-' :
				System.out.println("Enter the number");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("The difference of two numbers is "+Calculator.subtraction(a, b));
				break;
			case '*' :
				System.out.println("Enter the numbers");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("The multiplication of two numbers is "+Calculator.multiplication(a, b));
				break;
			case '/' :
				System.out.println("Enter the numbers");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("The division of two numbers is "+Calculator.division(a, b));
				break;
			case '%' :
				System.out.println("Enter the numbers");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("The remainder of two numbers is "+Calculator.findRemainder(a, b));
				break;
			case '^' :
				System.out.println("Enter the numbers");
				a = scan.nextInt();
				System.out.println("The square of the number is "+Calculator.findSquare(a));
				break;
			case '!' :
				System.out.println("Thank you for using Kodnest Calculator, bye bye");
				return;
			default:
				System.out.println("Please, Enter Valid Operator");
			}
			scan.close();
		}
	}
}
