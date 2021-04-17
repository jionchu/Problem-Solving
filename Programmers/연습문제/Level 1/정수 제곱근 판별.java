/* Programmers
 * 연습문제 - 정수 제곱근 판별
 * created on 2021.01.23
 * created by jionchu */

 class Solution {
    public long solution(long n) {
        long answer = -1; //n이 x의 제곱이 아닌 경우 -1 리턴
        long sqrt = (long)Math.sqrt(n); //제곱근 계산
        if (n == sqrt*sqrt) { //n이 정수 x의 제곱인 경우
            answer = (sqrt+1)*(sqrt+1); //x+1의 제곱 리턴
        }
        return answer;
    }
}