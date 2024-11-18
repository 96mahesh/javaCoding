
package arrayprograms;

import java.util.Scanner;

public class DuplicatesRemovie {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  Array Size");
		int size = scan.nextInt();
		int a[] = new int[size];
		int uni[] = new int[a.length], u = 0;
		int cou[] = new int[a.length], c = 0;
		System.out.println("Enter Value");
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i=0;i<a.length;i++) {
			count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(u==0) {
				uni[u++] = a[i];
				cou[c++] = count;
			}
			else {
				int find = 0;
				for(int k=0;k<u;k++)
					if(uni[k]==a[i])
						find++;
				if(find==0) {
					uni[u++] = a[i];
					cou[c++] = count;
				}
			}
			
			
		}
		for(int i=0;i<u;i++) {
		  System.out.println(uni[i]+" "+cou[i]);
		}
		
		scan.close();
		
	}
}
