/* Programmers
 * 연습문제 - 문자열 내림차순으로 배치하기
 * created on 2021.01.20
 * created by jionchu */

 import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] elements = s.split("");
        Arrays.sort(elements); //오름차순 정렬
        String answer = "";
        //내림차순으로 배치하기
        for (String e : elements)
            answer = e + answer;
        return answer;
    }
}