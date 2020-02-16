import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 8958: OX퀴즈
 * created on 2020.02.16
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		for (int test_case = 0;test_case < N;test_case++) {
			String result = br.readLine(); // OX 퀴즈 결과

			int sum = 0; // 퀴즈 점수
			int max = 0; // 연속된 문제의 개수
			
			for (int i = 0;i<result.length();i++) { // 각 문제의 결과 확인
				if(result.charAt(i) == 'O') {
					sum += ++max; // 문제 결과가 O인 경우 연속된 문제의 개수 증가, 최종 점수에 더하기
				}
				else max = 0; // 문제 결과가 X인 경우 연속된 문제의 개수 0으로 초기화, 점수는 0점이므로 더하지 않는다.
			}
			
			System.out.println(sum);
		}
		
	}
}
