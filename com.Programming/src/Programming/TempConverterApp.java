package Programming;

import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius ");
		float c = sc.nextFloat();
		TempConverter tc = new TempConverter();
		float f = tc.cToF(c);
		System.out.println("The temperature in farenheit is "+f);
		sc.close();
	}
}
