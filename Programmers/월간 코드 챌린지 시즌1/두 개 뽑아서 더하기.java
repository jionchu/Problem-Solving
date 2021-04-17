/* Programmers
 * 월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기
 * created on 2021.01.16
 * created by jionchu */

import java.util.TreeSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        
        TreeSet<Integer> set = new TreeSet<Integer>();
        //두 수의 덧셈값이 중복되지 않게 오름차순 정렬되어 저장됨
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        //정수 배열로 변환
        int[] answer = new int[set.size()];
        int i=0;
        Iterator it = set.iterator();
        while(it.hasNext())
            answer[i++] = (int)it.next();
        
        return answer;
    }
}