
public class ss {

	public static void main(String[] args) {
		
		int a[] = {1,1,1,1,0};
		
		int count = 0;
		for(int i=0;i<a.length;i++) {
			count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
			System.out.println(a[i]+" "+count+" ");
		}
	}
}
