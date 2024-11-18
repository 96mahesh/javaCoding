package strings_example;

public class RemovieDuplicateWordEachLetter {

	public static void main(String[] args) {
//		Goodbye bye bye world world world
//		Sam went went to to to his business
		
		String name = "Goodbye bye bye world world world";
		String a[] = name.split(" ");
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			char ch[] = word.toCharArray();
			char uni[] = new char[ch.length];
			int u = 0;
			for(int j=0;j<ch.length;j++) {
				if(u == 0) {
					uni[u++] = ch[j];
				}
				else {
					int find = 0;
					for(int k=0;k<u;k++)
						if(uni[k]==ch[j])
							find++;
					if(find == 0) {
						uni[u++] = ch[j];
					}
				}
				
			}
			
			for(int j=0;j<u;j++) {
				System.out.println(uni[j]);
			}
		}
	}
}
