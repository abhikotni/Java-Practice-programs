import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of pages in the book");
		int n = scan.nextInt();
		int i=1;
		boolean b;
		do {
			System.out.println("KodMan is studying page "+i);
			System.out.println("Are you got bored, Enter true or false");
			b = scan.nextBoolean();
			if(b== false) {
				i++;
			}
			else {
				break;
			}
		}while(i<=n);
		if(i<=n)
			System.out.println("KodMan got bored");
		else
			System.out.println("Book is completed");
		scan.close();
	}

}
