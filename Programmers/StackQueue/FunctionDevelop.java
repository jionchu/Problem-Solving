/* Programmers
 * 스택/큐 - 기능개발
 * created on 2021.01.02
 * created by jionchu */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int day=0;
        
        for (int j=0;j<progresses.length;j++) {
            //해당 기능이 배포 불가능한 경우
            if (progresses[j]+speeds[j]*day<100) {
                day = (int)Math.ceil((float)(100-progresses[j])/speeds[j]);
                answer[day] = 1;
            } else //배포 가능한 경우
                answer[day]++;
        }
        
        return Arrays.stream(answer).filter(i->i!=0).toArray();
    }
}