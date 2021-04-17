/* Programmers
 * 연습문제 - 가운데 글자 가져오기
 * created on 2021.01.03
 * created by jionchu */

 class Solution {
    public String solution(String s) {
        //단어의 길이가 짝수인 경우
        if (s.length()%2 == 0)
            return s.substring(s.length()/2-1, s.length()/2+1);
        else //단어의 길이가 홀수인 경우
            return s.substring(s.length()/2, s.length()/2+1);
    }
}