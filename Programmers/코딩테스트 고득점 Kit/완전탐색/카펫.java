/* Programmers
 * 완전탐색 - 카펫
 * created on 2021.01.23
 * created by jionchu */

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i=1;i<=Math.sqrt(yellow);i++) {
            //i가 yellow의 약수인 경우만 확인
            if (yellow % i == 0 && brown == (i+2+yellow/i)*2) {
                answer[0] = yellow/i+2; //가로길이
                answer[1] = i+2; //세로길이
                break;
            }
        }
        return answer;
    }
}