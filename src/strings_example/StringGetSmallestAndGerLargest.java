package strings_example;

public class StringGetSmallestAndGerLargest {

	public static void main(String[] args) {
		String name = "welcometojava";
		int k = 3;
		String max = name.substring(0,k);
		String min = name.substring(0, k);
		for(int i=0;i<name.length()-k+1;i++) {
			String x = name.substring(i, i+k);
			if(x.compareTo(min)>0)
					min = x;
			if(x.compareTo(max)<0)
					max = x;
		}
		
		System.out.println(min+" "+max);
		
	}
}
