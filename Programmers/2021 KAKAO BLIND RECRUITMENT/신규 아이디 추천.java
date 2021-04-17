/* Programmers
 * 2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천
 * created on 2021.02.12
 * created by jionchu */

class Solution {
    public String solution(String new_id) {
        //1단계
        String answer = new_id.toLowerCase();
        //2단계
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        //3단계
        answer = answer.replaceAll("[.]+",".");
        //4단계
        answer = answer.replaceAll("^[.]","");
        answer = answer.replaceAll("[.]$","");
        //5단계
        if (answer.isEmpty())
            answer = "a";
        //6단계
        if (answer.length() > 15)
            answer = answer.substring(0,15);
        answer = answer.replaceAll("[.]$","");
        //7단계
        while (answer.length() < 3)
            answer += answer.charAt(answer.length()-1);
        
        return answer;
    }
}