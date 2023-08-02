
public class ReverseNum {
	public int reverseCalculator(int n) {
		int rev=0;
		while(n>0) {
			int rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		}
		return rev;
	}
	public boolean palindromeChecker(int n, int rev) {
		if(n==rev) {
			return true;
		}
		else {
			return false;		
		}
	}
}
