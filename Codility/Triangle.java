/* Codility
 * Lesson 6 - Triangle
 * created on 2021.06.15
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        //오름차순 정렬
        Arrays.sort(A);        
        
        for (int i=2;i<A.length;i++) {
            //직전 두 길이를 이용해서 삼각형을 만들 수 있는지 확인
            //int 두 값을 더한 경우 overflow 생길 수 있으므로 long 변환
            if (A[i-2] > 0 && (long)A[i-2] + A[i-1] > A[i]) {
                return 1;
            }
        }

        //삼각형을 만들 수 없는 경우
        return 0;
    }
}