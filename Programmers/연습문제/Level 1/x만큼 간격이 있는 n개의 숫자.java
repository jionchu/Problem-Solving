/* Programmers
 * 연습문제 - x만큼 간격이 있는 n개의 숫자
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i=0;i<n;i++) {
            answer[i] = (long)x * (i + 1);
        }
        return answer;
    }
}