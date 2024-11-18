package strings_example;

public class MaxLengthOfString {

	public static void main(String[] args) {
		String name = "hello how are you mooooommmmm";
		String a[] = name.split(" ");
		String max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a.length>=max.length()) {
				max = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println();
		MinLengthOfString.main(args);
	}
}

class MinLengthOfString{
	public static void main(String[] args) {
		String name = "hello how are you mooooommmmm";
		String a[] = name.split(" ");
		String min = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a.length<=min.length()) {
				min = a[i];
			}
		}
		System.out.println(min);
		System.out.println();
		MaxLength.main(args);
	}
}

class MaxLength{
	public static void main(String[] args) {
		String name = "Python SpringBoot Javascript Java SpringBoot";
		String a[] = name.split(" ");
		String max = a[0];
		for (String x : a) {
			if(x.length()>max.length())
				max = x;
		}
		System.out.println(max);
	}
}
