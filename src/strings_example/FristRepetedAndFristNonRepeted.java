package strings_example;

public class FristRepetedAndFristNonRepeted {

	public static void main(String[] args) {
		
		String name = "java is easy";
		char fristrepted = ' ';
		char norepeted=' ';
		for(int i=0;i<name.length();i++) {
			char temp = name.charAt(i);
			if(temp!=0) {
				if(name.indexOf(temp) == name.lastIndexOf(temp)){
					if(fristrepted==' ') 
						fristrepted = temp;
					
					else if(norepeted==' ') 
						norepeted = temp;
				}
				else {
					if(fristrepted==' '&& norepeted==' ') {
						break;
					}
				}
			}
		}
		
		System.out.println(fristrepted+" "+norepeted);
		System.out.println();
		FristRepetedAndFristNonRepetedNumbers.main(args);
	}
}

class FristRepetedAndFristNonRepetedNumbers{
	public static void main(String[] args) {
		String name = "java is easy";
		char a[] = name.toCharArray();
		
		char firstrepetedchar = ' ';
		char fristnonrepetedchar = ' ';
		
		for(int i=0;i<a.length;i++) {
			char x = a[i];
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(firstrepetedchar==' ') {
						firstrepetedchar = x;
					}
					else if(fristnonrepetedchar==' '){
						fristnonrepetedchar = x;
					}
				}
				
				else {
					if(firstrepetedchar == ' ' && fristnonrepetedchar == ' ') {
						break;
					}
				}
			}
		}
		System.out.println(firstrepetedchar+" "+fristnonrepetedchar);
	}
	
}