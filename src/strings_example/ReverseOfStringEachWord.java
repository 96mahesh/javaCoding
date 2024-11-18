package strings_example;

public class ReverseOfStringEachWord {

	public static void main(String[] args) {
		String name = "java is super"; //avaj si repus
		String a[] = name.split(" ");
		String res = "";
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			String revword = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				revword = revword+word.charAt(j);
			}
			res = res+revword+" ";
		}
		System.out.println(res);
	}
}
