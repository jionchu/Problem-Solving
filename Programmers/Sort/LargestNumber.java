/* Programmers
 * 정렬 - 가장 큰 수
 * created on 2021.01.09
 * created by jionchu */

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        
        //문자열 배열로 변경
        for (int i=0;i<numbers.length;i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        
        //붙였을 때 더 큰 수가 되도록 정렬
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1+s2).compareTo(s2+s1);
            }
        });
        
        //큰 수부터 차례대로 연결
        String answer = "";
        for (int i=numbers.length-1;i>-1;i--) {
            answer+=nums[i];
        }
        
        //첫 번째 문자가 0인 경우 "0" return
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}