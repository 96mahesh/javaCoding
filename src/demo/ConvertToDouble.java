package demo;

public class ConvertToDouble {

	public static void main(String[] args) {
		
		String value= "2,75,376";
		String s = "";
		String a[] = value.split(",");
		for(int i=0;i<a.length;i++) {
			s = s+a[i];
		}
		System.out.println(s);	
		double Doublevalue = Double.parseDouble(s);
		System.out.println(Doublevalue);
	}
}
