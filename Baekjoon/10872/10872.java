import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Baekjoon Online Judge
 * 10872: 팩토리얼
 * created on 2020.07.07
 * created by jionchu */

public class Q10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
	}
	
	private static int factorial(int num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return num*factorial(num-1);
	}

}
