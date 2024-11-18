
public class Pairs {

	public static void main(String[] args) {
		
		int a[] = {10,14,5,6,11,8,9,15,19,7,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]+a[j]==20)
					System.out.println(a[i]);
			}
		}
	}
}
