import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 1316: 그룹 단어 체커
 * created on 2020.03.11
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	
		
		int count = 0, index;
		boolean[] check;
		boolean isGroupWord;
		
		for (int i=0;i<N;i++) {
			check = new boolean[26];
			isGroupWord = true;
			
			char[] word = br.readLine().toCharArray();
			char previous = word[0];
			check[previous-97]=true;
			
			for (int j=1;j<word.length;j++) {
				char newWord = word[j];
				index = word[j]-97;
				if (newWord != previous && check[index]) {
					// 단어가 떨어져서 나타난 경우
					isGroupWord = false;
						break;
				} else if (newWord != previous) {
					previous = newWord;
					check[index]=true;
				}
			}
			if (isGroupWord)
				count++;
		}
		
		System.out.println(count);
	}
}
