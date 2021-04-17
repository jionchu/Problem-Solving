/* Programmers
 * 연습문제 - 문자열 내 p와 y의 개수
 * created on 2021.01.19
 * created by jionchu */

class Solution {
    boolean solution(String s) {
        int p=0, y=0;
        //문자열 내 p와 y의 개수를 계산
        for (String ch: s.split("")) {
            //대소문자 구분 하지 않음
            if (ch.equalsIgnoreCase("p"))
                p++;
            else if (ch.equalsIgnoreCase("y"))
                y++;
        }
        //p의 개수와 y의 개수가 동일한 경우 true return
        //p의 개수와 y의 개수가 다른 경우 false return
        return p==y;
    }
}