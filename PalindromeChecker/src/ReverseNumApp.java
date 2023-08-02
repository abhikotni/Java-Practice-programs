import java.util.Scanner;

public class ReverseNumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		ReverseNum reverseNum = new ReverseNum();
		int rev = reverseNum.reverseCalculator(n);
		System.out.println("The Reverse Number of "+n+" is "+rev);
		boolean check = reverseNum.palindromeChecker(n, rev);
		if(check) {
			System.out.println("The given number "+n+" is Palindrome");
		}
		else {
			System.out.println("The given number "+n+" is not Palindrome");			
		}
		scan.close();
	}

}
