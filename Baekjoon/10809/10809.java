import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 10809: 알파벳 찾기
 * created on 2020.03.01
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toCharArray(); // 알파벳 소문자로만 이루어진 단어
		
		int[] location = new int[26];
		for (int i=0;i<26;i++) {
			location[i] = -1;
		}
		
		for (int i=0;i<word.length;i++) { // 단어의 모든 알파벳에 대해
			int loc = word[i]-97;
			if (location[loc]==-1) // 처음 등장한 경우
				location[loc] = i; // 현재 위치를 저장
		}
		
		StringBuilder buf = new StringBuilder();
		for (int i=0;i<26;i++) {
			buf.append(location[i]).append(" ");
		}
		System.out.println(buf.toString());
	}
}
