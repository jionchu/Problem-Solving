import java.util.Scanner;

/* Baekjoon Online Judge
 * 10951: A+B - 4
 * created at 2020.02.08
 * created by jionchu */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    while(sc.hasNextInt()) { // 입력이 더 이상 들어오지 않을 때까지 반복
      int A = sc.nextInt();
      int B = sc.nextInt();
      System.out.println(A+B);
    }
  }
}
