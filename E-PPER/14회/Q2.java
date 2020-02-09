import java.util.Scanner;

/* E-PPER 14회
 * Q2: 평균을 넘는 학생들의 비율
 * created at 2020.02.09
 * created by jionchu */

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = 0;
		int[] numbers = new int[N];
		
		for (int i=0;i<N;i++) {
			int num = sc.nextInt();
			sum+=num; // 모든 점수 더하기
			numbers[i] = num; // 각 점수를 배열에 저장
		}
		
		float avg = (float)sum/N; // 평균 계산
		int count = 0;
		for (int i=0;i<N;i++) {
			if(numbers[i]>avg) count++; // 평균보다 점수가 큰 경우
		}
		
		System.out.printf("%.3f%%",(float)count/N*100);
	}
}
