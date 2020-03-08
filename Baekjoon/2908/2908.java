import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Baekjoon Online Judge
 * 2908: 상수
 * created on 2020.03.08
 * created by jionchu */

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] line = br.readLine().toCharArray();
		
		// 거꾸로 읽은 숫자
		int num1 = (line[0]-'0')+(line[1]-'0')*10+(line[2]-'0')*100;
		int num2 = (line[4]-'0')+(line[5]-'0')*10+(line[6]-'0')*100;
		
		if (num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}

}
