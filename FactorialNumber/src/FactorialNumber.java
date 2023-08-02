import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which the factorial to be found");
		int n = scan.nextInt();
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact= fact*i;
		}
		System.out.println("The factorial of  "+n+"  is "+fact);
		scan.close();	
	}

}
