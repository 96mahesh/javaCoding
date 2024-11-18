package demo;

public class Print1_100UsingRecurciveMethod {

	static void p(int i) {
		if(i<=100) {
			System.out.println(i);
			i++;
			p(i);
		}
	}
	public static void main(String[] args) {
		p(1);
		
	}
}
