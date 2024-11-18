package demo;

import java.util.ArrayList;
import java.util.List;

public class PrintStringOddCharector {
	public static void main(String[] args) {
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		char a[] = name.toCharArray();
		List<Character> res = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				res.add(a[i]);
			}
		}
		
		System.out.println(res);
		System.out.println();
		PrintStringEvenCharecter.main(args);
	}
}

class PrintStringEvenCharecter{
	public static void main(String[] args) {
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		char a[] = name.toCharArray();
		List<Character> res = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				res.add(a[i]);
			}
		}
		
		System.out.println(res);
	}
}
