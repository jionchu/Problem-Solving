import java.util.Scanner;

/* E-PPER
 * Q1: 윤년 판별하기
 * created on 2020.02.09
 * created by jionchu */

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if((y%4==0&&y%100!=0)||y%400==0) // 윤년일 때
			System.out.println("T");
		else System.out.println("F"); // 윤년이 아닐 때
	}
}
