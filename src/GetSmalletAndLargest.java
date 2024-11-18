
public class GetSmalletAndLargest {

	public static void main(String[] args) {
		
		String name = "welcometojava"; //ava wel 
		int k = 3;
		String max = name.substring(0,k);
		String min = name.substring(0, k);
		
		for(int i=0;i<name.length()-k+1;i++) {
			String sub = name.substring(i,i+k);
			if(sub.compareTo(max)<0) {
				max = sub;
				
			if(sub.compareTo(min)>0)
				min = sub;
			}
		}
		
		System.out.println(max+" "+min);
	}
}
