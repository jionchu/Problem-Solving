import java.util.Scanner;

/*
Baekjoon Online Judge
11022: A+B - 8
*/

public class Main {
	
  public static void main(String[] args) {
		
    Scanner keyboard = new Scanner(System.in);
		
    int T = keyboard.nextInt();
    for (int i=0;i<T;i++) {
      int A = keyboard.nextInt();
      int B = keyboard.nextInt();
      System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B));
    }
  }
}
