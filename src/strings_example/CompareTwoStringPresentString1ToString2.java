package strings_example;

public class CompareTwoStringPresentString1ToString2 {

	public static void main(String[] args) {
		String str1 = "New York";
		String str2 = "NWYR";
		
		String res = "";
		for(int i=0;i<str1.length();i++) {
			char temp = str1.toLowerCase().charAt(i);
			if((str2.toLowerCase().indexOf(temp)>=0)) {
			 res += str1.charAt(i);
			}
			else {
				res += "+";
			}
		}
		System.out.println(res);
		System.out.println();
		CompareTwoString.main(args);
		System.out.println();
		StringsCompare.main(args);
	}
}

class CompareTwoString{
	public static void main(String[] args) {
		String str1 = "New York";
		String str2 = "NWYR";
		
	    char a[] = str1.toLowerCase().toCharArray();
		String res = "";
		for(int i=0;i<a.length;i++) {
			char x = a[i];
			if(str2.toLowerCase().indexOf(x)>=0) {
				res = res+a[i];
			}
			else {
				res = res+"+";
			}
		}
		
		System.out.println(res);
	}
}

class StringsCompare{
	public static void main(String[] args) {
		String str1 = "New York";
		String str2 = "NWYR";
		char a[] = str1.toLowerCase().toCharArray();
		char b[] = str2.toLowerCase().toCharArray();
		String res = "";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					res += a[i];
				}
			
				else {
					res += "+";
				}
			}
		}
		System.out.println(res);
		
	}
}
