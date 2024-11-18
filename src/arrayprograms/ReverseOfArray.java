package arrayprograms;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		ReverseNumber.main(args);
		System.out.println();
		HalfReverse.main(args);
		System.out.println();
		LatHalfReverse.main(args);
	}
}
class ReverseNumber{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

class HalfReverse{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		for(int i=0,j=a.length/2-1;i<j;i++,j--) {
			int temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

class LatHalfReverse{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		for(int i=a.length/2,j=a.length-1;i<j;i++,j--) {
			int temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}