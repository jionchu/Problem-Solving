/* Programmers
 * 연습문제 - 최솟값 만들기
 * created on 2021.04.16
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        //배열 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        //배열에 남은 수들 중
        //(가장 큰 수)*(가장 작은 수) 반복
        for (int i=0;i<A.length;i++) {
            answer += A[i]*B[B.length-i-1];
        }
        
        return answer;
    }
}