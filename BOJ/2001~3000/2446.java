import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2446: 별 찍기 - 9
 * created on 2020.03.30
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for (int i=0;i<num;i++) {
			for (int j=0;j<i;j++)
				System.out.print(" ");
			for (int j=0;j<(num-i)*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i=2;i<=num;i++) {
			for (int j=0;j<num-i;j++)
				System.out.print(" ");
			for (int j=0;j<i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
