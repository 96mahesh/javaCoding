
public class FristLetterUpperCase {

	public static void main(String[] args) {
		String name = "mahesh babu rampatruni";
		String a[] = name.split(" ");
		for (String c : a) {
			char x = c.charAt(0);
			String y = String.valueOf(x);
			c = c.replaceFirst(y, y.toUpperCase())+" ";
			System.out.println(c);
			
		}
	}
}
