
public class SequantialCount {

	public static void main(String[] args) {
		String str = "a1b2c3";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				char c = str.charAt(i);
				String x = String.valueOf(c);
				int num = Integer.parseInt(x);
				
				for(int j=0;j<=num;j++) {
					System.out.println(str.charAt(i-1));
				}
			}
		}
	}
}
