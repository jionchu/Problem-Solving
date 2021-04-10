/* Codility
 * Lesson 2 - CyclicRotation
 * created on 2021.04.10
 * created by jionchu */

class Solution {
    public int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];

        for (int i=0;i<answer.length;i++) { //K번 이동한 위치의 원소 저장
            answer[i] = A[(A.length+i-K%A.length)%A.length];
        }

        return answer;
    }
}