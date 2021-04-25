/* Codility
 * Lesson 3 - TapeEquilibrium
 * created on 2021.04.25
 * created by jionchu */

class Solution {
    public int solution(int[] A) {
        int total = 0; //tape 전체 길이
        int[] left = new int[A.length]; //처음부터 분할된 부분까지의 길이
        
        for (int i=0;i<A.length;i++) {
            total += A[i];
            left[i] = total;
        }
        
        //첫 번째 분할 영역의 길이
        int min = Math.abs(total - 2*left[0]);
        for (int i=1;i<left.length-1;i++) {
            //분할 부분 왼쪽과 오른쪽 길이 차이
            int distance = Math.abs(total - 2*left[i]);
            //가장 길이 차이가 작은 경우 찾기
            if (distance < min) {
                min = distance;
            }
        }

        return min;
    }
}