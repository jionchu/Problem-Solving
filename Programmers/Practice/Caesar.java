/* Programmers
 * 연습문제 - 시저 암호
 * created on 2021.01.20
 * created by jionchu */

 class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char ch : s.toCharArray()) {
            if (ch == ' ') //공백인 경우
                answer += ' ';
            else if (ch >= 'a' && ch <= 'z') //소문자의 경우
                answer += (char) ((ch-97+n)%26+97);
            else if (ch >= 'A' && ch <= 'Z') //대문자인 경우
                answer += (char) ((ch-65+n)%26+65);
        }
        return answer;
    }
}