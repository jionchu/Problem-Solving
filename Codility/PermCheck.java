/* Codility
 * Lesson 4 - PermCheck
 * created on 2021.05.18
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        //오름차순 정렬
        Arrays.sort(A);
        
        for (int i=0;i<A.length;i++) {
            if (A[i] != i+1) {
                //빠진 숫자가 있는 경우
                //종료
                return 0;
            }
        }

        //빠진 숫자 없이 연속된 숫자들의 배열인 경우
        return 1;
    }
}