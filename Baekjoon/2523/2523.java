import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2523: 별 찍기 - 13
 * created on 2020.03.29
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        
        for(int i=1;i<n;i++) {
            for (int j=1;j<=n-i;j++)
                System.out.print("*");
            System.out.println();
        }
	}
}
