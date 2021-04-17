import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2577: 숫자의 개수
 * created at 2020.02.10
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		
		String number = String.valueOf(A*B*C);
		int[] count = new int[10]; // 각 숫자가 몇번 쓰였는지 저장할 배열
		
		for (int i=0;i<number.length();i++) {
			count[Integer.parseInt(number.substring(i,i+1))]++; // 각 숫자가 무엇인지 확인
		}
		
		for (int i=0;i<10;i++)
			System.out.println(count[i]); // 각 숫자가 몇 번 쓰였는지 출력
		
	}

}
