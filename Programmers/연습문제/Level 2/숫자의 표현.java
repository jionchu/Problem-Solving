/* Programmers
 * 연습문제 - 숫자의 표현
 * created on 2021.04.07
 * created by jionchu */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1;i<=n;i++) {
            if (i % 2 == 0) { //짝수개의 합으로 나타내는 경우
                if (((n - i/2) % i == 0) && (n - i/2)/i > i/2) {
                    answer++;
                }
            }
            else { //홀수개의 합으로 나타내는 경우
                if ((n%i == 0) && (n/i > i/2)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}