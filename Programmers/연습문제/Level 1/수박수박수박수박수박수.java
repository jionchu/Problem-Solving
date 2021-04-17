/* Programmers
 * 연습문제 - 수박수박수박수박수박수?
 * created on 2021.01.21
 * created by jionchu */

class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i=0;i<n/2;i++) {
            answer += "수박";
        }
        //홀수인 경우 마지막에 "수" 추가
        if (n%2 == 1)
            answer += "수";
        return answer;
    }
}