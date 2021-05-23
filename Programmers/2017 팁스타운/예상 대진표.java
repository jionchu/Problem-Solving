/* Programmers
 * 2017 팁스타운 - 예상 대진표
 * created on 2021.05.23
 * created by jionchu */

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        //두 참가자가 서로 붙게 될 때까지
        while ((a-1)/2 != (b-1)/2) {
            a=(a-1)/2+1;
            b=(b-1)/2+1;
            //다음 라운드로
            answer++;
        }

        return answer;
    }
}