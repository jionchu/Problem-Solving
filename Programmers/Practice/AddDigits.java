/* Programmers
 * 연습문제 - 자릿수 더하기
 * created on 2021.01.20
 * created by jionchu */

public class Solution {
    public int solution(int n) {
        int answer = 0;
        //n이 두 자리수 이상인 경우
        while (n/10 > 0) {
            //일의 자리수 더하기
            answer += n%10;
            //10으로 나누기 (일의 자리수 버리기)
            n /= 10;
        }
        //마지막 남은 일의 자리수 더하기
        return answer+n;
    }
}