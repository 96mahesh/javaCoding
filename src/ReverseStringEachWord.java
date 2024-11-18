import java.util.Scanner;

public class ReverseStringEachWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");
		String line = scan.nextLine();
		String a[] = line.split(" ");
		String rev = "";
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			String revword = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				revword = revword+word.charAt(j);
			}
			rev = rev+revword+" ";
		}
		System.out.println(rev);
		System.out.println();
		RevEachString.main(args);
		scan.close();
	}
}
class RevEachString{
	
	public static void main(String[] args) {
		String name = "mahesh babu rampatruni";
		String a[] = name.split(" ");
		String rev = "";
		
		for (String x : a) {
			String word = x;
			String revword = "";
			for(int j=x.length()-1;j>=0;j--) {
				revword = revword+x.charAt(j);
			}
			rev = rev+revword+" ";
		}
		System.out.println(rev);
	}
	
	
}
