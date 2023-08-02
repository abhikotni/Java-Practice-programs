import java.util.Scanner;

public class Main { 
	public static void categorizeAge(int age) { 
		// your code here 
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}
		else if(age>=60) {
			System.out.println("Senior");
		}
		else {
			System.out.println("Enter the valid age");
		}
		} 
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scan.nextInt();
		categorizeAge(age);
		scan.close();
		} 
	
}
