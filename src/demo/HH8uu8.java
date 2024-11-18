package demo;

public class HH8uu8 {

	public static void main(String[] args) {
		String c = "HH8uu8";
		char a[] = c.toCharArray();
		int sum  = 0;
		for(int i=0;i<c.length();i++) {
			if(a[i]>='0' && a[i]<='9') {
				char x = a[i];
				String m = String.valueOf(x);
				sum = sum+Integer.parseInt(m);
			}
		}
		System.out.println(sum);
		System.out.println();
		Sum.main(args);
	}
}

class Sum{
	public static void main(String[] args) {
		String c = "HH8uu8";
		char a[] = c.toCharArray();
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0' && a[i]<= '9' ) {
				char x = a[i];
				String m = String.valueOf(x);
				sum = sum+Integer.parseInt(m);
			}
		}
		System.out.println(sum);
	}
	
}
