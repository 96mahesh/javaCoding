package arrayprograms;

public class LongestString {

	public static void main(String[] args) {
		 String[] toppings = {"Cheese", "Pepperoni", "Black Olives"}; // OUTPUT Black Olives
		 int maxlength = 0;
		 int minlength = toppings[0].length();
		 String res = "";
		 String minres = toppings[0];
		 
		 for (String s : toppings) {
			if(s.length()>maxlength) {;
			     res = s;
			}
			
			if(s.length() < minlength) {
				minres = s;
			}
		}
		 
		 System.out.println(res+"\n"+minres);
		 System.out.println();
		 LargestValue.m(args);
	}
}
class LargestValue{
	public static void m(String[] args) {
		
		 String[] toppings = {"Cheese", "Pepperoni", "Black Olives"}; // OUTPUT Black Olives
		 int maxlength = 0;
		 int minlength = toppings[0].length();
		 String res = "";
		 String minres = toppings[0];
		 
		 for(int i=0;i<toppings.length;i++) {
			 if(toppings.length>maxlength)
				 maxlength = toppings[i].length();
				 res = toppings[i];
				 if (toppings[i].length() < minlength) { // Compare length
		                minlength = toppings[i].length();
		                minres = toppings[i];
		            }
		 }
		 
		 

		 
		 System.out.println(res+"\n"+minres);
	}
}