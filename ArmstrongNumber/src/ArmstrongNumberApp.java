import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int arm = armstrongNumber.armstrongCalculator(n);
		boolean check = armstrongNumber.armstrongChecker(n, arm);
		if(check) {
			System.out.println("The given number "+n+" is Armstrong Number");
		}
		else {
			System.out.println("The given number "+n+" is not Armstrong Number");
		}
		scan.close();
	}

}
