/* Programmers
 * 연습문제 - 문자열 내 마음대로 정렬하기
 * created on 2021.01.16
 * created by jionchu */

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //해당 인덱스의 문자가 같은 문자열이 여럿인 경우
                //사전순으로 앞선 문자열이 앞쪽에 위치함
                if (s1.charAt(n) == s2.charAt(n))
                    return s1.compareTo(s2);
                else
                    return s1.charAt(n) - s2.charAt(n);
            }
        });
        
        return strings;
    }
}