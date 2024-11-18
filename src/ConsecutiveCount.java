import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveCount {

	public static void main(String[] args) {
		int a[] = {2, 6, 6, 6, 6, 5, 4, 6, 6, 8, 4, 6, 6, 6, 2, 6};
		int k = 6;
		int n = 3;
		
		List<int[]> res = new ArrayList<>();
		int s = 0, e = 0;
		int pre = 0;
		
		for(int i=0;i<a.length;i++) {
			int x = a[i];
			
			if(x == k) {
				e = i;
				if(pre!=k) {
					s = i;
				}
			}
			else {
				if(pre == k && e-s+1>=n)
					res.add(new int[] {s,e});
			}
			pre = x;
		}
		
		for (int[] is : res) {
			System.out.println(Arrays.toString(is));
		}
	}
}
