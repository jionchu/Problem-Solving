import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for (int test_case=1;test_case<=T;test_case++) {
			int N = sc.nextInt();
			int count = 0;
			
			String str1 = sc.next();
			String str2 = sc.next();
			
			for (int i=0;i<N;i++) {
				if(str1.charAt(i)==str2.charAt(i))
					count++;
			}
			
			System.out.println("#"+test_case+" "+count);
		}
		
	}
}
