/* Programmers
 * 연습문제 - 정수 내림차순으로 배치하기
 * created on 2021.01.22
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        //각 자리수를 담은 문자열 배열로 변경
        String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers); //오름차순 정렬
        
        String num = "";
        //내림차순으로 배치
        for (int i=1;i<=numbers.length;i++) {
            num += numbers[numbers.length-i];
        }
        
        // long 타입으로 변환해서 return
        return Long.parseLong(num);
    }
}