/* Programmers
 * 연습문제 - 서울에서 김서방 찾기
 * created on 2021.01.19
 * created by jionchu */

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i=0;i<seoul.length;i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}