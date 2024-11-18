package demo;

import java.util.*;

public class Odd_consecutive_number {

	public static List<int []> findOddFairs(int a , int b) {
		
		List<Integer> odd = new ArrayList<>();
		for(int i=0;i<=a;i=i+2) {
			odd.add(i);
		}
		
		List<int []> res = new ArrayList<>();
		for(int i=0;i<odd.size()-1;i++) {
			int x = odd.get(i);
			int y = odd.get(i+1);
			//System.out.println(x+" "+y);
			if(x+y>b)
				res.add(new int [] {x, y});
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int a = 60;
		int b = 100;
		
		List<int []> val = findOddFairs(a,b);
		for (int[] x : val) {
			System.out.println(x[0]+","+x[1]);
		}
		
		System.out.println();
		oddPairs.main(args);
	}
}

class oddPairs{
	
	public static void main(String[] args) {
		int a = 60;
		int b = 100;
		
		List<Integer> odd = new ArrayList<>();
		for(int i=0;i<=a;i=i+2) {
			odd.add(i);
		}
		
		List<int []> res = new ArrayList<>();
		for(int i=0;i<odd.size()-1;i++) {
			int x = odd.get(i);
			int y = odd.get(i+1);
			if(x+y>b)
				res.add(new int[] {x,y});
		}
		
		for (int[] x : res) {
			System.out.println(x[0]+","+x[1]);
		}
	}
}
