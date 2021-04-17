import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 1065: 한수
 * created on 2020.02.20
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 1000보다 작거나 같은 자연수
		
		int ans = 0;
		if(N<100) // 1부터 99까지의 모든 수는 한수이다.
			ans = N;
		else {
			ans = 99;
			for (int num=100;num<=N;num++) {
				// 둘째, 셋째 자리수의 차이와 첫째, 둘째 자리수의 차이를 비교
				if(num/10%10-num%10==num/100-num/10%10) ans++; // 둘의 차이가 같다면 한수이므로 ans 증가
			}
		}
		System.out.println(ans);
	}
	
}
