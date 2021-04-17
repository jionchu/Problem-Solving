/* Programmers
 * 연습문제 - 핸드폰 번호 가리기
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //뒷 4자리를 제외한 나머지 숫자를 *으로 가리기
        for (int i = 0; i<phone_number.length()-4;i++)
            answer+="*";
        //전화번호 맨 뒤 4자리 붙이기
        return answer+phone_number.substring(phone_number.length()-4);
    }
}