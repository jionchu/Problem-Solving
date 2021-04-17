/* Programmers
 * 연습문제 - 두 정수 사이의 합
 * created on 2021.01.18
 * created by jionchu */

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        //a와 b의 대소관계가 정해져 있지 않으므로
        //두 수의 차이의 절대값을 이용
        for (int i=0;i<=Math.abs(b-a);i++) {
            answer += Math.min(a,b)+i;
        }
        
        return answer;
    }
}