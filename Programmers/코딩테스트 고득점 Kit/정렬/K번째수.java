/* Programmers
 * 정렬 - K번째수
 * created on 2021.01.04
 * created by jionchu */

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0;i<commands.length;i++) {
            //i번째 수부터 j번째 수까지 자른 배열 생성
            int[] subArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            //배열 정렬
            Arrays.sort(subArray);
            //정렬한 배열의 k번째 수 확인
            answer[i] = subArray[commands[i][2]-1];
        }
        
        return answer;
    }
}