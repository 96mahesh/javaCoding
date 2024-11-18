package demo;

public class ReplaceCharector {

	public static void main(String[] args) {
		
		String name = "maheshbabu";		
		char a[] = name.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]=='e')
				a[i] = 'i';
			
			System.out.print(a[i]);
		}
	
	}
}
