package demo;

public interface AssignMentByPaparao {

	public static void main(String[] args) {
		
		String name = "hyderabad----is--a--big--city";
		String rev = "";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a' && name.charAt(i)<='z')
				rev = rev+name.charAt(i);
			else if(name.charAt(i-1)>='a' && name.charAt(i+1)<='z')
				rev = rev+" ";
		}
		System.out.println(rev);
		System.out.println();
		paparoAssignment.main(args);
	}
}

class paparoAssignment{
	public static void main(String[] args) {
	String name = "hyderabad----is--a--big--city";
	String rev =  "";
	char a[] = name.toCharArray();
	for(int i=0;i<a.length;i++) {
		if(a[i]>='a' && a[i]<='z') {
			rev = rev+a[i];
		}
		
		else if(a[i-1]>='a' && a[i+1]<='z') {
			rev = rev+" ";
		}
	}
	System.out.println(rev);
	}
	
}
