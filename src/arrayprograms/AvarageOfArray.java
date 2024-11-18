package arrayprograms;

public class AvarageOfArray {

	public static void main(String[] args) {
		
		int a[] = {2,5,3,9,6};
		int sum = 0;
		int avg = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			avg = sum/a.length;
		}
		
		System.out.println(sum);
		System.err.println(avg);
	}
}
