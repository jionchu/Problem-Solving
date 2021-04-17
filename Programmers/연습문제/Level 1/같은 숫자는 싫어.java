/* Programmers
 * 연습문제 - 같은 숫자는 싫어
 * created on 2021.01.15
 * created by jionchu */

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //이전 숫자와 다른 경우 리스트에 추가
        for (int i=0;i<arr.length;i++) {
            if (i==0 || arr[i] != arr[i-1])
                answer.add(arr[i]);
        }

        return answer.stream().mapToInt(i->i.intValue()).toArray();
    }
}