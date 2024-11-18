package strings_example;

public class StringPalinDrome {

	public static void main(String[] args) {
		
		String name = "madam";
		char a[] = name.toCharArray();
		String rev = "";
		
		for(int i=a.length-1;i>=0;i--) {
			rev = rev+a[i];
		}
		
		if(rev.equals(name)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
		System.out.println();
		palindrome.main(args);
	}
}

class palindrome{
	public static void main(String[] args) {
		String name = "madam";
		char a[] = name.toCharArray();
		String rev = "";
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			char temp = a[i];
			     a[i] = a[j];
			     a[j] = temp;
 		}
		
		for (char c : a) {
			rev = rev+c;
		}
		

		if(rev.equals(name)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
	}

}