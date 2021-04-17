import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		
    int N = keyboard.nextInt();
    int X = keyboard.nextInt();
		
    for (int i=0;i<N;i++) {
      int a = keyboard.nextInt();
      if (a<X) System.out.print(a+" ");
    }

  }

}
