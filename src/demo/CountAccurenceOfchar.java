package demo;

public class CountAccurenceOfchar {

	public static void main(String[] args) {
		
		 String name = "mahesh babu rampatruni";
		 String str = "a";
		 int count = 0;
		 char a[] = name.toCharArray();
		 char b[] = str.toCharArray();
		 
		 for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					count++;
			}
		 }
		 System.out.println(count);
	}
}
