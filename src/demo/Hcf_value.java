package demo;

public class Hcf_value {

	public static void main(String[] args) {
		
		int a = 2, b = 4;
		int hcf = 0;
		
		while(b!=0) {
			hcf = a;
			  a = b;
			  b = hcf%2;
		}
		System.out.println(hcf);
	}
}
