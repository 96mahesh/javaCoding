package arrayprograms;

public class PushZeroBackAndFrent {

	public static void main(String[] args) {
		int a[] = {1,0,6,7,0,8,9,0,5,4,0,3,0,2,0};
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				    j++;
			}
		}
		for (int i : a) {
		System.out.print(i+" ");	
		}
		
		System.out.println();
		pushZeroFront.main(args);
	}

}

class pushZeroFront{
	public static void main(String[] args) {
		int a[] = {1,0,6,7,0,8,9,0,5,4,0,3,0,2,0};
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				    j++;
			}
		}
		for (int i : a) {
		System.out.print(i+" ");	
		}
	}
	}

