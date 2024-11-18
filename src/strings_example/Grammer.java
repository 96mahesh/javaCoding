package strings_example;

import java.util.Scanner;

public class Grammer {

	public static void main(String[] args) {
		// input "aLL THe bESt";   output = All The Best
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String value");
		String name = scan.nextLine();
		char a[] = name.toCharArray();
		String res ="";
		for(int i=0;i<a.length;i++) {
			char x = a[i];
			if(i==0 && (x >= 'a' && x <= 'z')) {
				x =(char) (x-32);
			}
			else if(a[i]-1==' ' && (x >= 'a' && x <= 'z')) {
				x =(char) (x-32);
			}
			else if(i!=0 && a[i]-1!=' ' && (x >= 'A' && x <= 'Z')) {
				x =(char) (x+32);
			}
			
			res = res+x;
			
		}
		System.out.println(res);
		scan.close();
	}
}
