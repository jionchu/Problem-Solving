import java.util.Scanner;
public class Main {
	public static void main(String[] ar){
		Scanner keyboard = new Scanner(System.in);
		int T = keyboard.nextInt();
		for(int i=0;i<T;i++) {
			int A = keyboard.nextInt();
			int B = keyboard.nextInt();
			System.out.println(A+B);
		}
	}
}
