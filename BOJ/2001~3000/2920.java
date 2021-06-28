/* Baekjoon Online Judge
 * 2920: 음계
 * created on 2021.06.28
 * created by jionchu */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //8개 숫자 저장
        int[] numbers = new int[8];
        for (int i=0;i<8;i++) {
            numbers[i] = br.read();
            
            //공백 무시
            br.read();
        }

        //초기 상태 - ascending: true / descending: false
        boolean status = (numbers[0] < numbers[1]);

        for (int i=1;i<numbers.length;i++) {
            //현재 상태와 달라지는 경우 mixed 출력 후 종료
            if (status && numbers[i-1] > numbers[i] ||
                !status && numbers[i-1] < numbers[i]) {
                System.out.println("mixed");
                return;
            }
        }

        if (status) System.out.println("ascending");
        else System.out.println("descending");
    }
}