import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 11720: 숫자의 합
 * created on 2020.02.29
 * created by jionchu */
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[] numbers = br.readLine().toCharArray(); // 각 숫자들 저장
		
		int sum = 0;
		for (int i=0;i<numbers.length;i++) { // 배열의 모든 수 더하기
			sum+=Integer.parseInt(String.valueOf(numbers[i]));
		}
		
		System.out.println(sum);
	}
}
