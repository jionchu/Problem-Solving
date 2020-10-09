import java.util.Scanner;

/* E-PPER 14회
 * Q6: 이등분하는 좌표
 * created on 2020.10.09
 * created by jionchu */

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = 0;
		float y2 = 0;
		
		if (x1 == 0) { // y축 위의 좌표
			if (y1 <= 125) {
				x2 = 31250/(250-y1);
				y2 = -x2+250;
			} else {
				x2 = 31250/y1;
				y2 = 0;
			}
		} else if (y1 == 0) { // x축 위의 좌표
			if (x1 <= 125) {
				y2 = 31250/(250-x1);
				x2 = 250-y2;
			} else {
				y2 = 31250/x1;
				x2 = 0;
			}
		} else { // 빗변 위의 좌표
			if (x1 <= 125) {
				x2 = 250-31250/y1;
				y2 = 0;
			} else {
				y2 = 250-31250/x1;
				x2 = 0;
			}
		}
		
		sc.close();
		System.out.printf("%.2f %.2f",x2,y2);
	}
}
