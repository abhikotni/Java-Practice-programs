import java.util.Scanner;

public class FibApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range upto which the fibonacci series needed to be printed");
		int n = scan.nextInt();
		Fib.findSeries(n);
		scan.close();
	}

}
