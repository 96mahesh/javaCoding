
public class FristRepetedNonRepetd {

	public static void main(String[] args) {
		String name = "java is super";
		char a[] = name.toCharArray();
		char firstrepeted = ' ';
		char nonrepeted = ' ';
		for(int i=0;i<a.length;i++) {
			char temp = a[i];
			if(temp!=0) {
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						if(firstrepeted==' ')
							firstrepeted = temp;
						else if(nonrepeted ==' ')
							nonrepeted = temp;
						   break;
					}
				}
			}
		}
		
		System.out.println(firstrepeted + " " + nonrepeted);
		System.out.println();
		repetedNorepeted.main(args);
	}
}

class repetedNorepeted{
	public static void main(String[] args) {
		String name = "java is super";
		char repeted = ' ';
		char nonrepeted = ' ';
		
		for(int i=0;i<name.length();i++) {
			char x = name.charAt(i);
		if(name.indexOf(x) == name.indexOf(x)) {
			if(repeted == ' ')
				repeted = x;
			else if(nonrepeted == ' ')
				nonrepeted = x;
			
			else if(repeted == ' ' && nonrepeted == ' ')
				break;
		}
		}
		
		System.out.println(repeted+" "+nonrepeted);
		
	}
}
