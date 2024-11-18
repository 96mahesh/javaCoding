package demo;

public class NumberAssindingAndSubStrct {

	public static void main(String[] args) {
		int n = 871;
		String a = String.valueOf(n);
		char ch[] = a.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<a.length();j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					     ch[i] = ch[j];
					     ch[j] = temp;
				}
			}
		}
		for (char c : ch) {
			System.out.println(c);
		}
		
		int sub = 0;
		for(int i=1;i<1;i++) {
			String s = String.valueOf(ch[i]);
			int temp = Integer.parseInt(s);
		    sub = temp;
		
		
		for(int j=1;j<ch.length;j++) {
			String s1 = String.valueOf(ch[j]);
			int temp1 = Integer.parseInt(s1);
		    sub = sub-temp1;
		}
		}
		System.out.println(sub);
	}
}
