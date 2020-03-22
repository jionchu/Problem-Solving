import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/* Baekjoon Online Judge
 * 10250: ACM 호텔
 * created on 2020.03.22
 * created by jionchu */
 
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 0;test_case<T;test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder result = new StringBuilder();
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken())-1;
			
			result.append(N%H+1); // 층수 계산
			if(N/H<9)
				result.append("0");
			result.append(N/H+1);
			
			System.out.println(result.toString());
		}
		
	}
}
