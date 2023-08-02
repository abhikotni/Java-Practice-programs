import java.util.Scanner;

public class Newmain {

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();
	}
	public static void identifyCharacter(char ch)

	{
		if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Special Character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				if(Character.isLowerCase(ch)) {
					System.out.println("Lower-case Vowel");
				}
				else {
					System.out.println("Upper-case Vowel");
				}
				break;
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("Lower-case Consonant");
				}
				else {
					System.out.println("Upper-case Consonant");
				}
				break;
			}
		}
	}

}
