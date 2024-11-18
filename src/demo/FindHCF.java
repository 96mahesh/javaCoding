package demo;

import java.util.Scanner;

public class FindHCF {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("ENTER X Y VALUES");
		 int x = scan.nextInt();
		 int y = scan.nextInt();
		 int hcf = 0;
		 for(int i=1;i<=y;i++) {
			 if(x%i==0 && y%1==0 )
				 hcf  = i;
		 }
		System.out.println(hcf);
		scan.close();
	}
}
