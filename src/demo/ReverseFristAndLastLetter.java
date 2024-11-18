package demo;

import java.util.Arrays;

public class ReverseFristAndLastLetter {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		 int b = a[0];
		 a[0] = a[a.length-1] ;
		 a[a.length-1]  = b;
		 
		 System.out.println(Arrays.toString(a));
	}
}
