import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Baekjoon Online Judge
 * 2750: 수 정렬하기
 * created on 2020.07.19
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[N];
		
		for (int i=0;i<N;i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i=0;i<N;i++) {
			int min = 1001;
			int minIndex = 0;
			for (int j=0;j<N;j++) {
				if (numbers[j] < min) {
					min = numbers[j];
					minIndex = j;
				}
			}
			System.out.println(min);
			numbers[minIndex] = 1001;
		}
	}
}
