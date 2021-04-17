import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2941: 크로아티아 알파벳
 * created on 2020.03.12
 * created by jionchu */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] word = br.readLine().toCharArray();
		
		int count = 0;
		for (int i=0;i<word.length;i++) {
			char a = word[i];
			if (i == word.length-1) // 단어의 마지막 알파벳인 경우
				count++;
			else {
				switch (a) {
					case 'c':
						if (word[i+1]=='=' || word[i+1]=='-')
							i++;
						break;
					case 'd':
						if (word[i+1]=='z' && i+2<word.length && word[i+2]=='=')
							i+=2;
						else if (word[i+1]=='-')
							i++;
						break;
					case 'l':
						if (word[i+1]=='j')
							i++;
						break;
					case 'n':
						if (word[i+1]=='j')
							i++;
						break;
					case 's':
						if (word[i+1]=='=')
							i++;
						break;
					case 'z':
						if (word[i+1]=='=')
							i++;
						break;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}
}
