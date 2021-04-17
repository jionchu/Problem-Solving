/* Programmers
 * 연습문제 - 평균 구하기
 * created on 2021.01.18
 * created by jionchu */

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        //배열의 모든 정수 더하기
        for (int i=0;i<arr.length;i++)
            answer += arr[i];
        return answer/arr.length;
    }
}