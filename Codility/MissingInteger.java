/* Codility
 * Lesson 4 - MissingInteger
 * created on 2021.05.17
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        int answer = 0;

        //오름차순 정렬
        Arrays.sort(A);
        
        for (int num : A) {
            if (num > 0 && num > answer+1) {
                break;
            } else if (num > 0){
                answer = num;
            }
        }

        return answer+1;
    }
}