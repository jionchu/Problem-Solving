/* Codility
 * Lesson 5 - PassingCars
 * created on 2021.06.03
 * created by jionchu */

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        int count = 0;

        for (int i=A.length-1;i>=0;i--) {
            if (A[i] == 0) {
                answer += count;
                if (answer > 1000000000) {
                    return -1;
                }
            } else {
                count++;
            }
        }

        return answer;
    }
}