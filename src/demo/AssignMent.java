package demo;

public class AssignMent {

	public static void main(String[] args) {
		String str = "hi mahesh";
		String str2 = "mahesh";
		String word = "";
		String a[] = str.split(" ");
		for(int i=0;i<a.length;i++) {
			String c = a[i];
			if(c.equals(str2)) {
				word = c;
			}
		}
		System.out.println(word);
		System.out.println();
		Assinment.main(args);
	}
}

class Assinment{
	public static void main(String[] args) {
		String a[] = {"hi" ,"mahesh"};
		String b[] = {"mahesh"};
		String word = "";
		
		for(int i=0;i<a.length;i++) {
			String c = a[i];
			for(int j=0;j<b.length;j++) {
				String d = b[j];
				
				if(c==d)
					word = c;
			}
		}
		System.out.println(word);
	}
}
