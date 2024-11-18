import java.util.*;

public class Odd_consecutive_count {

	public static List<int[]> findOddPair(int a, int b) {
		List<Integer> odd = new ArrayList<>();
		for(int i=0;i<=a;i++) {
			if(i%2==1)
			odd.add(i);
		}
		
		List<int []> res = new ArrayList<>();
		for(int i=0;i<odd.size()-1;i++) {
			int x = odd.get(i);
			int y = odd.get(i+1);
			if(x+y>b)
			res.add(new int [] {x,y});
		}
		return res;
	}
	public static void main(String[] args) {
		int a = 60;
		int b = 100;
		
		List<int[]> val = findOddPair(a,b);
		
		for (int[] x : val) {
			System.out.println( x[0] + ", " + x[1] );
		}
	}
}
