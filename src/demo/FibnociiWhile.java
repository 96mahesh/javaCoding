package demo;

public class FibnociiWhile {

	public static void main(String[] args) {
	int max = 10;
	int a = 0, b = 1, c = 0;
	
	while(c<=max) {
		c = a+b;
		if(c>max) {
			break;
		}
		System.out.println(c);
		a = b;
		b = c;
	}
	}
}
