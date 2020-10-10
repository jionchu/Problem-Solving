import java.util.Scanner;

/* E-PPER 14회
 * Q10: 승차권 자동 발매기
 * created on 2020.10.10
 * created by jionchu */

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] dest = new String[n];
		for (int i=0;i<n;i++) {
			dest[i] = sc.nextLine();
		}
		
        String init = sc.nextLine();
        //키보드 초기화
		char[] keyboard = new char[32];
		for (int i=0;i<32;i++) {
			keyboard[i] = '*';
		}
		
		for (String destination : dest) {
			if (destination.startsWith(init)) {
				if (destination.length() > init.length()) {
					char outputChar = destination.charAt(init.length());
					keyboard[(int)outputChar-62] = outputChar;
				}
			}
		}
		
        //키보드 출력
		for (int i=0;i<32;i++) {
			System.out.print(keyboard[i]);
			if (i%8 == 7) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}