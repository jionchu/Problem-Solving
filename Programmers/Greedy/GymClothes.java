/* Programmers
 * 탐욕법(Greedy) - 체육복
 * created on 2021.01.03
 * created by jionchu */

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        //학생들의 체육복 개수 담을 배열
        int[] student = new int[n];
        
        for (int i:lost) student[i-1]--;
        for (int i:reserve) student[i-1]++;
        
        for (int i=0;i<student.length;i++) {
            //체육복이 없는 경우
            if (student[i] == -1) {
                if (i>0 && student[i-1]==1) {
                    student[i]++;
                    student[i-1]--;
                } else if (i<n-1 && student[i+1] == 1) {
                    student[i]++;
                    student[i+1]--;
                } else {
                    //체육복을 빌리지 못한 경우
                    answer--;
                }
            }
        }
        
        return answer;
    }
}