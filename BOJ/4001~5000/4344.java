import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 4344: 평균은 넘겠지
 * created on 2020.02.17
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
		
		for (int test_case=0;test_case<C;test_case++) {
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]); // 학생의 수
			
			int[] numbers = new int[N]; // 학생들의 점수 배열
			int sum = 0;
			for (int i=0;i<N;i++) {
				numbers[i] = Integer.parseInt(line[i+1]); // 학생별 점수 저장
				sum += numbers[i]; // 평균을 구하기 위해 총합 계산
			}
			
			float avg = (float)sum/N;
			int count = 0;
			for (int i=0;i<N;i++) {
				if (numbers[i]>avg)
					count++; // 평균보다 점수가 높은 경우 카운팅
			}
			
			System.out.printf("%.3f%%\n",(float)count/N*100); // 평균보다 높은 점수를 가진 학생들의 비율 출력
		}
	}
}
