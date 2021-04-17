/*
Baekjoon Online Judge
11021: A+B - 7
*/
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
		
    Scanner keyboard = new Scanner(System.in);
		
    int n = keyboard.nextInt();
    for(int i=0;i<n;i++) {
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      System.out.println("Case #"+(i+1)+": "+(a+b));
    }

  }
}
