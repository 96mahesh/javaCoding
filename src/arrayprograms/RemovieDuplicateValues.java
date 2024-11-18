package arrayprograms;

public class RemovieDuplicateValues {

	public static void main(String[] args) {
		
		int a[] = {1,1,1,1,0};
		
		int uni[] = new int[a.length],u=0;
		int cou[] = new int[a.length],c=0;
		int count = 0;
		for(int i=0;i<a.length;i++) {
			count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
				int f = 0;
				for(int k=0;k<u;k++)
					if(uni[k] == a[i])
						f++;
				if(f==0) {
					uni[u++] = a[i];
					cou[c++] = count;
				}
			}
		
		
		for(int i=0;i<u;i++) {
			System.out.println(uni[i]);
		}
		
	}
}
