package demo;

public class Disctnory_order {

	public static void main(String[] args) {
		 String[] name = { "John","Remo","Mixy","Julie","Ronny"};
		 String res = "";
		 for(int i=0;i<name.length;i++) {
			 for (int j=0;j<name.length;j++) {
			 if(name[i].compareTo(name[j])<0) {
				 res = name[i];
				 name[i] = name[j];
				 name[j] = res;
			 }
			 }
		 }
		 
		 for (String x : name) {
		System.out.println(x);	
		}
	}
}
