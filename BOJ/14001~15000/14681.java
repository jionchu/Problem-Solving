import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 14681: 사분면 고르기
 * created on 2020.03.24
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if (x>0 && y>0)
			System.out.println(1);
		else if (x>0 && y<0)
			System.out.println(4);
		else if (x<0 && y>0)
			System.out.println(2);
		else
			System.out.println(3);
	}
}
