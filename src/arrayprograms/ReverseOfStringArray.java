package arrayprograms;

public class ReverseOfStringArray {

	public static void main(String[] args) {
		String a[] = {"true","false","false","true","false","true"};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		Reverse.m(args);
		System.out.println();
		Half_reverse.m1(args);
		System.out.println();
		Last_Halfreverse.m2(args);
	}

}
class Reverse{
	public static void m(String[] args) {
		String a[] = {"true","false","false","true","false","true"};
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			String temp = a[i];
			       a[i] = a[j];
			       a[j] = temp;
		}
		
		for (String x : a) {
			System.out.print(x+" ");
			}
	}
}

class Half_reverse{
	public static void m1(String[] args) {
		String a[] = {"true","false","false","true","false","true"};
		for(int i=a.length/2,j=a.length-1;i<j;i++,j--) {
			String temp = a[i];
		       a[i] = a[j];
		       a[j] = temp;
		}
		
		for (String x : a) {
			System.out.print(x+" ");
			}
	}
}
//false false true true false true
class Last_Halfreverse{
	public static void m2(String[] args) {
		String a[] = {"true","false","false","true","false","true"};
		for(int i=0,j=a.length/2-1;j>i;i++,j--) {
			String temp = a[i];
		       a[i] = a[j];
		       a[j] = temp;
		}
		
		for (String x : a) {
			System.out.print(x+" ");
			}
	}
}