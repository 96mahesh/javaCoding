package arrayprograms;

public class SearchArray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == 50) {
				a[i] = 500;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
