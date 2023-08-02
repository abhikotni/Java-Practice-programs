
public class Fib {
	public static void findSeries(int n) {
		if(n==1) {
			System.out.println("0");
		}
		else if(n==2) {
			System.out.println("0 1");
		}
		else {
			int fib1=0;
			int fib2=1;
			System.out.print("0 1 ");
			for(int i=3;i<=n;i++) {
				int nextNo = fib1+fib2;
				System.out.print(nextNo+" ");
				fib1=fib2;
				fib2=nextNo;
			}
		}
	}
}
