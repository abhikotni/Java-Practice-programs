package Programming;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the name of Student");
		s1.name = sc.nextLine();
		System.out.println("Enter the age of Student");
		s1.age = sc.nextInt();
		System.out.println("The Name of Student is "+s1.name);
		System.out.println("The Age of Student is "+s1.age);
		sc.close();
	}

}
