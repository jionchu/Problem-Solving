import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 3052: 나머지
 * created at 2020.02.10
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] remainder = new boolean[42];
		int count = 0;
		for (int i=0;i<10;i++) {
			int n = Integer.parseInt(br.readLine());
			if(!remainder[n%42]) { // 이미 나온 나머지인지 확인
				remainder[n%42]=true; // 기존과 다른 나머지이면 true로 변경
				count++;
			}
		}
		
		System.out.println(count);
	}

}
