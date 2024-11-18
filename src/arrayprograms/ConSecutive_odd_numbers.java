
package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class ConSecutive_odd_numbers {

	 public static void main(String[] args) {
	        int a = 60;
	        int b = 100;
	        List<int[]> result = findOddPairs(a, b);
	        for (int[] pair : result) {
	            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
	        }
	    }
	 
	    public static List<int[]> findOddPairs(int a, int b) {
	        List<Integer> oddNumbers = new ArrayList<>();
	        for (int i = 1; i < a; i += 2) {
	            oddNumbers.add(i);
	        }
	 
	        List<int[]> result = new ArrayList<>();
	        for (int i = 0; i < oddNumbers.size() - 1; i++) {
	            int num1 = oddNumbers.get(i);
	            int num2 = oddNumbers.get(i + 1);
	            if (num1 + num2 > b) {
	                result.add(new int[]{num1, num2});
	            }
	        }
	 
	        return result;
	    }
}
