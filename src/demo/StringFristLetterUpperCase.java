package demo;

public class StringFristLetterUpperCase {

	public static void main(String[] args) {
		
		String name = "mahesh babu rampatruni";
		String a[] = name.split(" ");
		for (String x : a) {
			char ch = x.charAt(0);
			String y = String.valueOf(ch);
			x = x.replaceFirst(y,y.toUpperCase())+" ";
			System.out.println(x);
		}
		
	}
}
