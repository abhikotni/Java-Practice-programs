import java.util.Scanner;

public class MultiplePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		Multiples.twoDivisible(n);
		Multiples.threeDivisible(n);
		Multiples.fiveDivisible(n);
		Multiples.twoAndFiveDivisible(n);
		Multiples.threeAndFiveDivisible(n);
		Multiples.primeNumber(n);
		Multiples.twoAndThreeDivisible(n);
		Multiples.OddAndFiveDivisible(n);
		Multiples.evenPrimeNumber(n);
		scan.close();
	}

}
