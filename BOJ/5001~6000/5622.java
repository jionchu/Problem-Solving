import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 5622: 다이얼
 * created on 2020.03.10
 * created by jionchu */

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] words = br.readLine().toCharArray();
		
		int time = 0; // 총 걸린 시간
		for (int i=0;i<words.length;i++) {
			time += getDial(words[i]); // 각 알파벳마다 걸린 시간 더하기
		}
		System.out.println(time);
	}
	
	public static int getDial(char word) {
		int dial;
		switch(word) {
			case 'A': case 'B': case 'C':
				dial = 3;
				break;
			case 'D': case 'E': case 'F':
				dial = 4;
				break;
			case 'G': case 'H': case 'I':
				dial = 5;
				break;
			case 'J': case 'K': case 'L':
				dial = 6;
				break;
			case 'M': case 'N': case 'O':
				dial = 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				dial = 8;
				break;
			case 'T': case 'U': case 'V':
				dial = 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				dial = 10;
				break;
			default:
				dial = 0; break;
		}
		return dial;
	}
}
