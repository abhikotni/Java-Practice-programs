import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();
		if (marks<50) { 
			System.out.println("D - Grade");
			System.out.println("Chaduvukondhi firstuu");
		}
		else if (marks>=50 && marks<60) {
			System.out.println("C - Grade");
			System.out.println("Siggu undhali raa");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("B - Grade");
			System.out.println("Try Hard");
		}
		else if (marks>=70 && marks<80) {
			System.out.println("A - Grade");
			System.out.println("ok ok");
		}
		else {
			System.out.println("A+ - Grade");
			System.out.println("Super ra thammudu");
		}
		scan.close();
	}

}
