import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2292: 벌집
 * created on 2020.03.18
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count=0;
		N-=1;
		while(N>0) {
			count++;
			N-=6*count;
		}
		System.out.println(count+1);
	}
}
