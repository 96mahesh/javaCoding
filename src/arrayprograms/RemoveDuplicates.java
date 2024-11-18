package arrayprograms;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,1,5,4,5,3,5};
		Arrays.sort(a);
		
		int uni[] = new int[a.length], u = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
				uni[u++] = a[i];
		}
		uni[u++] = a[a.length-1];
		
		for(int i=0; i<u;i++) {
			System.out.println(uni[i]);
		}
		
	}
		
}



