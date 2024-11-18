package demo;

public class FristRepetedAndFristNonRepetedChar {

	public static void main(String[] args) {
		
		String name = "java is easy";
		char fristchar = ' ';
		char nonrepetedcahar = ' ';
		
		for(int i=0;i<name.length();i++) {
			char x = name.charAt(i);
			if(name.indexOf(x) == name.lastIndexOf(x)) {
				if(fristchar  ==' ') {
					fristchar = x;
				}
				else if(nonrepetedcahar == ' ') {
					nonrepetedcahar = x;
				}
				else {
					if(fristchar==' '&& nonrepetedcahar==' ')
						break;
				}
			}
		}
		System.out.println(fristchar+" "+nonrepetedcahar);
		System.out.println();
		reretedandnonrepeted.main(args);
	}
}

class reretedandnonrepeted{
	public static void main(String[] args) {
		
		String name = "java is easy";
		char a[] = name.toCharArray();
		char fr = ' ';
		char fnr = ' ';
		
		for(int i=0; i<a.length;i++) {
			char x = a[i];
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(fr == ' ') {
						fr = x;
					}
					else if(fnr == ' ') {
						fnr = x;
					}
					else{
						if(fr == ' ' && fnr == ' ' ) {
							break;
						}
					}
				}
			}
		}
		System.out.println(fr+" "+fnr);
		
	}
}
