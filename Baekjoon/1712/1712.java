import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 1712: 손익분기점
 * created on 2020.03.13
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = br.readLine().split(" ");
		
		int A = Integer.parseInt(numbers[0]);
		int B = Integer.parseInt(numbers[1]);
		int C = Integer.parseInt(numbers[2]);
		
		int diff = C-B;
		if (diff>0) // 손익분기점이 존재하는 경우
			System.out.println(A/diff+1);
		else // 손익분기점이 존재하지 않는 경우
			System.out.println(-1);
	}
}
