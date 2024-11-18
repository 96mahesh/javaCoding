
public class FibnociiSeries {

	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1, c = 0;
		System.out.println(a+" "+b);
		
		do {
			c = a+b;
			if(c>n) {
				break;
			}
			System.out.println(c);
			a = b;
			b = c;
		}while(c<=n);
	}
}
