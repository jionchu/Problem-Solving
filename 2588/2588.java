import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = a*(b%10);
		int d = a*(b%100/10);
		int e = a*(b/100);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(c+d*10+e*100);
	}
}
