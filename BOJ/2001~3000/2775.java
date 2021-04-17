import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2775: 부녀회장이 될테야
 * created on 2020.03.21
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case=0;test_case<T;test_case++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			int[][] house = new int[14][14];
			
			for (int i=0;i<14;i++) {
				house[i][0]=1; // 1호
				house[0][i]=i+1; // 0층
			}
			
			for (int i=1;i<k;i++) {
				for (int j=1;j<n;j++) {
					house[i][j]=house[i][j-1]+house[i-1][j];
				}
			}
			
			int people=0;
			for (int i=0;i<n;i++) {
				people+=house[k-1][i];
			}
			
			System.out.println(people);
		}
	}

}
