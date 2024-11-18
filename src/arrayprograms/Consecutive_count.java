package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutive_count {

	public static void main(String[] args) {
		 int a[] = {2, 6, 6, 6, 6, 5, 4, 6, 6, 8, 4, 6, 6, 6, 2, 6};
		 System.out.println(Arrays.toString(a));
	      int k = 6;
	      int n = 3;
	      
	      List<int[]> res = new ArrayList<>();
	      int start = 0 , end = 0;
	      int prev = 0;
	      
	      for(int i=0;i<a.length;i++) {
	    	  int x = a[i];
	    	  if(x == k) {
	    		  end  = i;
	    		 if(prev!= k) {
	    			start = i; 
	    		 }
	    	  }
	    	  else {
	    		  if(prev == k && end -start+1 >= n) {
	    			  res.add(new int[] {start, end});
	    		  }
	    	  }
	    	  prev = x;
	      }
	      
	      for (int[] x : res) {
			System.out.println(Arrays.toString(x));
		}
		}
		 
	}

