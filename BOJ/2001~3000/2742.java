import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		for (int i=0;i<n;i++)
			System.out.println((n-i));
		
	}
}
