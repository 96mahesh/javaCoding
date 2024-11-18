package demo;

public class StringFristAndLastUpperCase {

	public static void main(String[] args) {
		String name = "power star pawan kalyan";
		String a[] = name.split(" ");
		String n = "";
		for (String x : a) {
			String frist = x.substring(0,1);
			String secound = x.substring(1, x.length()-1);
			String throad = x.substring(x.length()-1);
			n = n+frist.toUpperCase()+secound+throad.toUpperCase()+" ";
		}
		System.out.println(n);
	}
}
