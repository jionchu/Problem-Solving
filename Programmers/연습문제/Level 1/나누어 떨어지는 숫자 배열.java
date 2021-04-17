/* Programmers
 * 연습문제 - 나누어 떨어지는 숫자 배열
 * created on 2021.01.18
 * created by jionchu */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        //나누어 떨어지는 숫자만 리스트에 저장
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%divisor == 0)
                list.add(arr[i]);
        }
        
        int[] answer;
        //나누어 떨어지는 숫자가 한 개도 없는 경우
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            //배열로 변경
            answer = new int[list.size()];
            for (int i=0;i<list.size();i++) {
                answer[i] = list.get(i);
            }
            //오름차순 정렬
            Arrays.sort(answer);
        }
        
        return answer;
    }
}