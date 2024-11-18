package strings_example;

public class StringBraceProgram {

	public static void main(String[] args) {
		
		String name = "{}{}{}";
		char a[] = name.toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					char temp = a[i];
					     a[i] = a[j];
					     a[j] = temp;
				}
			}
		}
		
		for (char c : a) {
			System.out.print(c);
		}
	}
}
