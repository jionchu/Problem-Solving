/* Baekjoon Online Judge
 * 1037: 약수
 * created on 2021.07.12
 * created by jionchu */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
        // 약수들을 저장할 배열
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 약수들 저장
        for (int i=0;i<n;i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(numbers);

        // 제곱수가 아닌 경우
        if (n % 2 == 0) {
            System.out.println(numbers[0]*numbers[n-1]);
        } 
        // 제곱수인 경우
        else {
            System.out.println(numbers[n/2]*numbers[n/2]);
        }
	}
}
