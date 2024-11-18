package strings_example;

public class PrintMoreThen4Letters {

	public static void main(String[] args) {
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		String a[] = name.split(" ");
		String res = "";
		for(int i=0;i<a.length;i++) {
			String x = a[i];
			if(x.length()>=4) {
				res = res+a[i]+" ";
			}
			
		}
		System.out.println(res);
	}
}
