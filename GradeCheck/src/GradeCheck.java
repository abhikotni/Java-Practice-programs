import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade");
		int grade = scan.nextInt();
		checkGrade(grade);
		scan.close();
	}
	public static void checkGrade(int grade)	{ 
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
