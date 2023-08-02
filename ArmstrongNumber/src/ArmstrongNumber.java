
public class ArmstrongNumber {
 public int armstrongCalculator(int n) {
	 int or= n;
	 int size= 0;
	 while(or>0) {
		 or=or/10;
		 size++;
	 }
	 int arm=0;
	 while(n>0) {
		 int rem = n%10;
		 arm= (int) (arm+(Math.pow(rem,size)));
		 n=n/10;
	 }
	 return arm;
 }
 public boolean armstrongChecker(int n, int arm) {
	 if(n==arm) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
}
