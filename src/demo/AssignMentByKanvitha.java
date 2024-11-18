package demo;

import java.util.ArrayList;
import java.util.List;

public class AssignMentByKanvitha {

	public static void main(String[] args) {
		 int a[] = {10,20,30,40,50}; //int[] a= {1,2,3,4,5};
		 int sum = 0;
		 List<Integer> ls = new ArrayList<>();
		 for(int i=0;i<a.length;i++) {
			 sum = sum+a[i];
		 }
		 System.out.println(sum);
		 for (int i : a) {
			ls.add(i+sum);
		}
		 System.out.println(ls);
	}
}
