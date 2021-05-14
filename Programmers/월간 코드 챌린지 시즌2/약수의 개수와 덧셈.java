/* Programmers
 * 월간 코드 챌린지 시즌2 - 약수의 개수와 덧셈
 * created on 2021.05.14
 * created by jionchu */

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        
        return answer;
    }
}