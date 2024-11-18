package arrayprograms;

public class MaxMinStringArray {

	public static void main(String[] args) {
		String c[] = {"coffe","chai","water","Dait Cocke"};
		int min = c[0].length();
		int max = 0;
		int y = 0;
		int x = 0;
		String value = "";
		String maxValue = "";
		for(int i=0;i<c.length;i++) {
			if(c[i].length() < min) {//4>0
				min = c[i].length();
				y = i;
				value = c[i];	
			}
			if(c[i].length() > max) {
				max = c[i].length();
				x = i;
				maxValue = c[i];
			}
		}
		System.out.println(min+" "+y+" "+value);
		System.out.println(max+" "+x+" "+maxValue);
		
		
		System.out.println();
		MaxMinString.main(args);
	}
}

class MaxMinString{
	
	public static void main(String[] args) {
		String c[] = {"coffe","chai","water","Dait Cocke"};
		int max = 0;
	    int min = c[0].length();
		String res = "";
		String minres ="";
		for (String x : c) {
			if(x.length()>max)
			 res = x;
			
			if(x.length() < min)
				minres = x;
		}
		
		
		System.out.println(res+" "+minres);
	}
}

