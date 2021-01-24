/* Programmers
 * 연습문제 - 이상한 문자 만들기
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        //i : 전체 문자열에서 문자의 index
        //count : 각 단어에서 문자의 index
        int i = 0, count = -1;
        for (char c : ch) {
            count++;
            if (c == ' ') //공백인 경우
                count = -1;
            else if (count % 2 == 0) //짝수번째 문자를 대문자로
                ch[i] = String.valueOf(c).toUpperCase().charAt(0);
            else //홀수번째 문자를 소문자로
                ch[i] = String.valueOf(c).toLowerCase().charAt(0);
            i++;
        }
        return String.valueOf(ch);
    }
}