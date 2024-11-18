package arrayprograms;

public class MinMaxWitIndex {

	public static void main(String[] args) {
		int a[] = {2,5,1,9,6}; // max 9 index 3
		int max=0;
		int min = a[0];
		int index = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
				index = i;
			}
		}
		System.out.println(max+" "+index);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
				index = i;
			}
				
		}
		System.out.println(min+" "+index);
		System.out.println();
		MinMax.main(args);
	}
}

class MinMax{
	public static void main(String[] args) {
		int a[] = {2,5,1,9,6}; 
		int min = a[0];
		int max = a[0];
		
		for (int i : a) {
			if(max<i) {
				max = i;
			}
			
			if(min>i) {
				min=i;
			}
			
		}
		System.out.println(max+"\n"+min);
		
		
	}
}
