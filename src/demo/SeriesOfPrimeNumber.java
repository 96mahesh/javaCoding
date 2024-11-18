package demo;

public class SeriesOfPrimeNumber {

	public static void main(String[] args) {
		int l = 900, u = 1000;
		int count = 0;
		for(int i=l;i<=u;i++) {
			int fact = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					fact++;
			}
			
			if(fact == 2) {
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println(count);
	}
}
