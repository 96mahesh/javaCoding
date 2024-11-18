package strings_example;

public class StringOddReverseEvenUppercase {

	public static void main(String[] args) {
		String name = "this is a test String!!"; // THIS si a tset STRING!!
		String a[] = name.split(" ");
		String rev = "";
		
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			if(i%2==1) {
				for(int j=word.length()-1;j>=0;j--) {
					rev = rev+word.charAt(j);
				}
			}
			
			
			else {
				rev = rev+word.toUpperCase();
			}
			rev = rev+" ";
			
		}
		
		System.out.println(rev);
 }
}
