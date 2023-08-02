
public class Multiples {
	public static void twoDivisible(int n) {
		System.out.println("The numbers Divisible by 2 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void threeDivisible(int n) {
		System.out.println("The numbers Divisible by 3 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void fiveDivisible(int n) {
		System.out.println("The numbers Divisible by 5 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void twoAndFiveDivisible(int n) {
		System.out.println("The numbers Divisible by 2 and 5 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%2==0&&i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void threeAndFiveDivisible(int n) {
		System.out.println("The numbers Divisible by 3 and comes in table of 5 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void primeNumber(int n) {
		System.out.println("The prime numbers between 1 and "+n+" are");
		int count =0;
		for(int i=2;i<=n;i++) {
			boolean s= true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					s=false;
					break;
				}
			}
			if(s) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("The number of prime numbers between 1 and "+n+" are "+count);
		System.out.println("---------------------------------------------------------");
	}
	public static void twoAndThreeDivisible(int n) {
		System.out.println("The even numbers Divisible by 3 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%3==0&&i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void OddAndFiveDivisible(int n) {
		System.out.println("The odd numbers Divisible by 5 between 1 and "+n+" are");
		for(int i=1;i<=n;i++) {
			if(i%2!=0&&i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------");
	}
	public static void evenPrimeNumber(int n) {
		System.out.println("The prime numbers between 1 and "+n+" are");
		for(int i=2;i<=n;i++) {
			boolean s= true;
			if(i%2==0) {
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					s = false;
					break;
				}
			}
			if(s) {
				System.out.println(i);
			}
		}
		}
		System.out.println("---------------------------------------------------------");
	}
}
