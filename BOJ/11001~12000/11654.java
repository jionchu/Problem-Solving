import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 11654: 아스키 코드
 * created on 2020.02.28
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a = br.readLine().charAt(0);
		
		System.out.println((int)a); // 아스키 코드값 출력
	}

}
