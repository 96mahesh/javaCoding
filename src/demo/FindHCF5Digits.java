package demo;

public class FindHCF5Digits {

	public static void main(String[] args) {
		
		int a = 2, b = 4, c = 6, d = 8, e = 10;
		int hcf = 0;
		
		for(int i=1;i<=e;i++) {
			if(a%1==0 && b%i==0 && c%i==0 && d%i==0 && e%i==0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
	}
	
}
