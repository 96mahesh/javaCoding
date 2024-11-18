package demo;

public class SwapingUsingWithOutThroadVariable {

	public static void main(String[] args) {
		
		String a = "mahesh";
		String b = "pawan";

		System.out.println("Before Swaping " + a + " " + b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swaping " + a + " " + b);

	}
}
