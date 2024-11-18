package strings_example;

public class StringCountUpperAndLowerCase {

	public static void main(String[] args) {
		String name = "JavA5is&Sub6p%eR"; //4 8 2 2 
		int u = 0;
		int l = 0;
		int n = 0;
		int s = 0;
		char a[] = name.toCharArray();
		
		for (char c : a) {
			
			if(Character.isUpperCase(c))
				u++;
			else if(Character.isLowerCase(c))
				l++;
			else if(Character.isDigit(c))
				n++;
			else
				s++;
		}
		
	   System.out.println(u);
	   System.out.println(l);
	   System.out.println(n);
	   System.out.println(s);
	   System.out.println();
	   StringCountCharector.main(args);
	}
}

class StringCountCharector{
	public static void main(String[] args) {
		String name = "JavA5is&Sub6p%eR";
		int u = 0;
		int l = 0;
		int n = 0;
		int s = 0;
		char a[] = name.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' && a[i]<='Z')
				u++;
			else if(a[i]>='a' && a[i]<='z')
				l++;
			else if(a[i]>='0' && a[i]<='9')
				n++;
			else
				s++;
			
		}
		
		System.out.println(u);
		System.out.println(l);
		System.out.println(n);
		System.out.println(s);
	}
}
