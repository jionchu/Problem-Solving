/* Programmers
 * 연습문제 - 문자열 다루기 기본
 * created on 2021.01.19
 * created by jionchu */

class Solution {
    public boolean solution(String s) {
        //문자열 길이가 4 혹은 6이 아닌 경우
        if (s.length() != 4 && s.length() != 6)
            return false;
        else {
            //숫자로만 구성되어 있는지 확인
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9')
                    return false;
            }
            return true;
        }
    }
}