/* Programmers
 * 월간 코드 챌린지 시즌2 - 음양 더하기
 * created on 2021.04.21
 * created by jionchu */

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i=0;i<absolutes.length;i++) {
            if (signs[i]) //양수인 경우
                answer += absolutes[i];
            else //음수인 경우
                answer -= absolutes[i];
        }
        
        return answer;
    }
}