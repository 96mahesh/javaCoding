package arrayprograms;

public class GetSmallestAndLargetsString {

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		String max = s.substring(0,k);
		String min = s.substring(0,k);
		
		for(int i=0;i<s.length()-k+1;i++) {
			String x = s.substring(i,i+k);
			if(x.compareTo(max)>0) {
				max = x;
			}
			if(x.compareTo(min)<0) {
				min = x;
			}
		}
		System.out.println(max+"\n"+min);
		System.out.println();
		MinMaxString.main(args);
	}
}
class MinMaxString{
	public static void main(String[] args) {
		String s = "welcometojava";
		int k =3;
		String min = s.substring(0, k);
		String max = s.substring(0, k);
		
		for(int i=0;i<s.length()-k+1;i++) {
			String x = s.substring(i, i+k);
			if(max.compareTo(x)<0)
				max = x;
			if(min.compareTo(x)>0)
				min = x;
		}
		
		System.out.println(max+"\n"+min);
	}
}