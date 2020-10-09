import java.util.Scanner;

/* E-PPER 14회
 * Q7: 신문 스캐너
 * created on 2020.10.09
 * created by jionchu */

public class Q2019_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<r;i++) {
			String line = sc.nextLine();
			for (int j=0;j<zr;j++) { // 행 확대
				String result = "";
				for (char text : line.toCharArray()) {
					for (int k=0;k<zc;k++) { // 열 확대
						result = result+text;
					}
				}
				System.out.println(result);
			}
		}
		
		sc.close();
	}
}
