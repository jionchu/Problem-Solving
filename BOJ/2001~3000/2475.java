/* Baekjoon Online Judge
 * 2475: 검증수
 * created on 2021.06.28
 * created by jionchu */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        for (int i=0;i<5;i++) {
            int num = br.read()-'0';
            //제곱수 더하기
            sum += num * num;
            
            //공백 무시
            br.read();
        }

        //10으로 나눈 나머지 출력
        System.out.println(sum%10);
    }
}
