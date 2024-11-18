package strings_example;

import java.util.Arrays;

public class StringCovertToArray {

	public static void main(String[] args) {
		String name = "java is super keka easy and awesome "; //["is","keka","and"]
		String a[] = name.split(" ");
		String res[] = new String[a.length/2];
		int u= 0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				res[u++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
}
