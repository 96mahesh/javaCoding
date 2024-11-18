package arrayprograms;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int p = a.length, q = b.length;
		int r = p+q;
		int x[] = new int[r],y=0;
		for(int i=0;i<p;i=i+1) {
			x[y++] = a[i];
		}
		
		for(int i=0;i<q;i=i+1) {
			x[p++] = b[i];
		}
		
		System.out.println(Arrays.toString(x));
		System.out.println();
		MergedArrays.main(args);
	}
}

class MergedArrays{
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int p = a.length, q = b.length;
		int r = p+q;
		int x[] = new int[r],y=0;
		for (int i : a) {
			x[y++] = i;
		}
		
		for (int i : b) {
			x[y++] = i;
		}
		
		System.out.println(Arrays.toString(x));
	}
}
