/* Codility
 * Lesson 5 - CountDiv
 * created on 2021.05.20
 * created by jionchu */

class Solution {
    public int solution(int A, int B, int K) {
        int answer = B/K;

        if (A == 0) answer++;
        else answer -= (A-1)/K;

        return answer;
    }
}