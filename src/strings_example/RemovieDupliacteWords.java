package strings_example;

public class RemovieDupliacteWords {

	public static void main(String[] args) {
		
		String name = "i am mahesh i am in AutomationEngineer";
		String a[] = name.split(" ");
		
		String uni[] = new String[a.length];
		int u = 0;
		
		for(int i=0;i<a.length;i++) {
			if(u==0) {
				uni[u++] = a[i];
			}
			else {
				int find = 0;
				for(int k=0;k<u;k++)
					if(uni[k].equals(a[i]))
						find++;
				
				if(find==0) {
					uni[u++] = a[i];
				}
			}
			
		}
		for(int i=0;i<u;i++) {
			System.out.println(uni[i]);
		}
	}
}
