/* Codility
 * Lesson 1 - BinaryGap
 * created on 2021.04.08
 * created by jionchu */

class Solution {
    public int solution(int N) {
        int answer = 0;
        int gaps = 0;

        while (N > 0) {
            if (N % 2 == 1) {
                if (gaps > answer)
                    answer = gaps - 1;
                gaps = 1;
            } else if (gaps > 0) {
                gaps++;
            }
            N/=2;
        }

        return answer;
    }
}