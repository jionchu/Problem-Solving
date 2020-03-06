import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 5543: 상근날드
 * created on 2020.03.06
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		int min = 2000;
		for (int i=0;i<3;i++) { // 가장 싼 햄버거 찾기
			int cost = Integer.parseInt(br.readLine());
			if (cost < min)
				min = cost;
		}
		sum += min;
		
		int coke = Integer.parseInt(br.readLine());
		int cider = Integer.parseInt(br.readLine());
		if (coke < cider) // 콜라와 사이다 중 싼 가격 더하기
			sum = sum+coke-50;
		else
			sum = sum+cider-50;
		
		System.out.println(sum);
	}
}
