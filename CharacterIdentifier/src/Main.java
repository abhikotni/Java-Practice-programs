import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)

	{
		if(Character.isLowerCase(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Lower-case Vowel");
			}
			else {
				System.out.println("Lower-case Consonant");
			}
		}
		else if(Character.isUpperCase(ch)) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Upper-case Vowel");
			}
			else {
				System.out.println("Upper-case Consonant");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();
	}
}
