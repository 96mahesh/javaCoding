package strings_example;

public class StringBress {

	public static void main(String[] args) {
		
		String name = "{{}}}}";
		char a[] = name.toCharArray();
		char uni[] = new char[a.length], u = 0;
		int cou[] = new int[a.length], c = 0;
		int count = 0;
		for(int i=0;i<a.length;i++) {
			count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			if(u==0) {
				uni[u++] = a[i];
				cou[c++] = count;
			}
			else {
				int find = 0;
				for(int k=0;k<u;k++) {
					if(uni[k]==a[i])
						find++;
				}
				if(find==0) {
					uni[u++] = a[i];
					cou[c++] = count;
				}
			}
		}
		int x = 0;
		for(int i=0;i<u;i++) {
			x = (a.length-cou[i])/2; // x == 1
		}
		System.out.println("x is"+x);
		for(int i=0;i<u;i++) {
			if(a.length/2<=cou[i]) {
				cou[i] = cou[i]-x;
				System.out.println(cou[i]);
			}
			else {
				cou[i] = cou[i]+x;
				System.out.println(cou[i]);
			}
		}
		
		for(int i=0;i<u;i++) {
			for(int j=0;j<cou[i];j++) {
				System.out.print(uni[i]);
			}
		}
	}
}
