package demo;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int rev = 0;
		 while(n>0) {
			 int rem = n%10;
			 rev += rem*rem*rem;
			 n = n/10;
		 }
		 
		 System.out.println(rev);
		 
		 if(rev == temp ) {
			 System.out.println("no is armstrong");
		 }
		 else {
			 System.out.println("no is not a armstrong");
		 }
	}
	
}
