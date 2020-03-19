import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2869: 달팽이는 올라가고 싶다
 * created on 2020.03.19
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int V = Integer.parseInt(line[2]);
		
		System.out.println((int)Math.ceil((double)(V-A)/(A-B))+1);
	}
}
