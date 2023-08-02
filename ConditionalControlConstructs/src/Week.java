import java.util.Scanner;

public class Week {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int a = scan.nextInt();
		switch(a)
		{
		case 1 :
			System.out.println("Supra Sunday");
			break;
		case 2 :
			System.out.println("Maruthi Monday");
			break;
		case 3 :
			System.out.println("Toyato Tuesday");
			break;
		case 4 :
			System.out.println("Wagonar Wednesday");
			break;
		case 5 :
			System.out.println("Tata Thursday");
			break;
		case 6 :
			System.out.println("Ferrari Friday");
			break;
		case 7 :
			System.out.println("Suziki Saturday");
			break;
		default :
			System.out.println("Firstly Learn the number of Days in a week broooooooooo");
		}
		scan.close();
	}
}
