package demo;

public class StringEveenOdd {

	public static void main(String[] args) {
		
		String name = "this is a test String!!"; // THIS si a tset STRING!!
		String a[] = name.split(" ");
		String rev = "";
		
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			
			if(i%2==0) {
				rev = rev+word.toUpperCase();
			}
			else {
				for(int j=word.length()-1;j>=0;j--) {
					rev = rev+word.charAt(j);
				}
			}
			rev = rev+" ";
		}
		System.out.println(rev);
	}
}
