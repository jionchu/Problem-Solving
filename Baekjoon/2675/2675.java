import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2675: 문자열 반복
 * created on 2020.03.03
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 0; test_case < T; test_case++) {
			String line[] = br.readLine().split(" ");
			int R = Integer.parseInt(line[0]);
			char[] S = line[1].toCharArray();
			StringBuilder buf = new StringBuilder();
			for (int i=0;i<S.length;i++) { // 각 문자마다
				for (int j=0;j<R;j++) { // R 만큼 반복해서 출력
					buf.append(S[i]);
				}
			}
			System.out.println(buf.toString());
		}
	}
}
