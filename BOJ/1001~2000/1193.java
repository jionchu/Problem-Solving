import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 1193: 분수찾기
 * created on 2020.03.17
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int max=0;
		while(X>0) {
			max++;
			X-=max;
		}
		
		X+=max;
		if (max%2!=0) // down
			System.out.println((max-X+1)+"/"+X);
		else // up
			System.out.println(X+"/"+(max-X+1));
	}
}
