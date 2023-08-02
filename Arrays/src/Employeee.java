import java.util.Scanner;

public class Employeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of people");
		boolean arr[] = new boolean[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Is the person "+i+" is married.... Enter true or false");
			arr[i]=scan.nextBoolean();
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i])
				System.out.println("Person "+i+" is married");
			else
				System.out.println("Person "+i+" is not married");
		}
		scan.close();
	}

}
