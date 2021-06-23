/* Baekjoon Online Judge
 * 1010: 다리 놓기
 * created on 2021.06.23
 * created by jionchu */

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        //테스트 케이스별로 실행
        for (int i=0;i<T;i++) {
            
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);
            
            int count = 0;
            
            if (N == M) count = 1;
            else if (N < M && M-N >= N) {
                count = cal(N, M);
            }
            else if (N < M && M-N < N) {
                count = cal(M-N, M);
            }
            else if (N > M && N-M >= M) {
                count = cal(M, N);
            }
            else {
                count = cal(N-M, N);
            }
            
            System.out.println(count);
        }
	}
    
    static int cal(int count, int all) {
        //all개 중에 count개를 선택하는 경우의 수
        //all_C_count
        long sum = 1;

        for (int i=0;i<count;i++) {
            sum *= (all-i);
        }
        
        for (int i=1;i<=count;i++) {
            sum /= i;
        }

        return (int)sum;
    }
}