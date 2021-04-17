import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2839: 설탕 배달
 * created on 2020.03.15
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int rest = N%5;
		if (rest==0)
			System.out.println(N/5);
		else if (rest==3)
			System.out.println(N/5+1);
		else if ((rest==1||rest==4)&&N-rest>=5)
			System.out.println(N/5-1+(rest+5)/3);
		else if ((rest==2)&&(N-rest>=10))
			System.out.println(N/5+2);
		else // 정확하게 N 킬로그램을 만들 숭 없는 경우
			System.out.println(-1);
	}
}
