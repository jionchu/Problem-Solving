import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Baekjoon Online Judge
 * 10870: 피보나치 수 5
 * created on 2020.07.08
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int num) {
		if (num == 0 || num == 1)
			return num;
		else if (num == 2)
			return 1;
		else
			return fibonacci(num-1) + fibonacci(num-2);
	}
}
