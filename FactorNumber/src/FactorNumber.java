import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  number for which factorial is needed to be found");
		int  n = scan.nextInt();
		System.out.println("The factors of "+n+" are");
		for(int i =1;i<=n;i++)
		{
			if(n%i==0) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
