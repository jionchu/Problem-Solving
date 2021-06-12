/* Codility
 * Lesson 6 - MaxProductOfThree
 * created on 2021.06.12
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int size = A.length;

        //오름차순 정렬
        Arrays.sort(A);

        //가장 큰 세 수 곱하기
        int max = A[size-1] * A[size-2] * A[size-3];

        //양수와 음수가 섞여 있는 경우
        if (A[0] < 0 && A[size-1] > 0) {
            //양수 1, 음수2
            //가장 큰 양수, 가장 작은 음수
            if (A[0] * A[1] > 0 && A[0] * A[1] * A[size-1] > max) {
                max = A[0] * A[1] * A[size-1];
            }
        }

        return max;
    }
}