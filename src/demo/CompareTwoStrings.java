package demo;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1 = "New York";
		String str2 = "NWYR";
		String res = "";
		
		for(int i=0;i<str1.length();i++) {
			char x = str1.toLowerCase().charAt(i);
			if(str2.toLowerCase().indexOf(x)>=0) {
				res += x;
			}
			else {
				res += "+";
			}
		}
		System.out.println(res);
	}
}
