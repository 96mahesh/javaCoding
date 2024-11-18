package arrayprograms;

import java.util.Arrays;

public class MergeStringArray {

	public static void main(String[] args) {
		String a[] = {"chai","coffe"} , b[] = {"milk","water","cock"};
		int a1 = a.length, b1 = b.length;
		int c1 = a1+b1;//5
		String c[] = new String[c1];
		int p = 0;
		for(int i=0;i<a1;i=i+1) {
			c[p++] = a[i];
		}
		
		for(int i=0;i<b1;i=i+1) {
			c[p++] = b[i];
		}
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		MergString.main(args);
	}
}

class MergString{
	
	public static void main(String[] args) {
		String a[] = {"chai","coffe"} , b[] = {"milk","water","cock"};
		int a1 = a.length, b1 = b.length;
		int c1 = a1+b1;
		String c[] = new String[c1];
		int p = 0;
		for (String x : a) {
			c[p++] = x;
		}
		for (String x : b) {
			c[p++] = x;
		}
		
		for (String x : c) {
			System.out.print(x+" ");
		}
	}
}
