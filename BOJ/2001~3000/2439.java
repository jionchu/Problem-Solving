import java.util.Scanner;

/*
Baekjoon Online Judge
2439: 별 찍기 - 2
*/

public class Main {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		
    int N = keyboard.nextInt();
    for (int i=1;i<=N;i++) {
      for (int j=0;j<(N-i);j++)
        System.out.print(" ");
      for (int j=0;j<i;j++)
        System.out.print("*");
      System.out.println();
    }
			
  }
}
