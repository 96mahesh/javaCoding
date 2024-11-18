package demo;

import java.util.Scanner;

public class GetSmallestAndLorgest {

	public static void main(String[] args) {
		// input welcometojava  output wel, ava
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String line = scan.nextLine();
		int k = scan.nextInt();
		String max = line.substring(0, k);
		String min = line.substring(0, k);
		
		for(int i=0;i<line.length()-k+1;i++) {
			String x = line.substring(i,i+k);
			if(x.compareTo(max) <= 0) {
				max = x;
			}
			
			if(x.compareTo(min) >= 0) {
				min = x;
			}
		}
		
		System.out.println(max+" "+min);
		scan.close();
	}
}
