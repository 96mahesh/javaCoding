package strings_example;

public class StringEvenOddUsingMethod {
	
	public static String getReverce(String input) {
		String res = "";
		for(int i=input.length()-1;i>=0;i--) {
			res = res+input.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		
		String name = "this is a test string!!";
		String a[] = name.split(" ");
		String odd ="";
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			String revers = getReverce(word);
			if(i%2==0) {
				odd = odd+word.toUpperCase();
			}
			else {
				odd = odd+revers;
			}
			odd += " ";
		}
		
		System.out.println(odd);
	}
}
