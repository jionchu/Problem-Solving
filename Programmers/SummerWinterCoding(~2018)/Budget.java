/* Programmers
 * Summer/Winter Coding(~2018) - 예산
 * created on 2021.01.24
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); //오름차순 정렬
        for (int i=0;i<d.length;i++) {
            //작은 금액을 신청한 부서부터 지원
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            } else //더 이상 지원할 수 없는 경우
                break;
        }
        return answer;
    }
}