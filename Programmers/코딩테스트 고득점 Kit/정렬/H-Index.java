/* Programmers
 * 정렬 - H-Index
 * created on 2021.01.06
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); //정렬

        for (int i=citations.length-1;i>-1;i--) {
            //인용수가 현재 h보다 크지 않은 경우
            //현재 h가 h의 최댓값임
            if (citations[i] <= answer)
                break;
            answer++;
        }
        
        return answer;
    }
}