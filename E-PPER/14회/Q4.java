import java.util.Scanner;

/* E-PPER 14회
 * Q4: 잔디깎기
 * created on 2020.10.09
 * created by jionchu */

public class Q4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if (n>m) {
			result = 2*(m-1);
		} else {
			result = 2*(n-1);
		}
		
		sc.close();
		System.out.println(result);
	}
}