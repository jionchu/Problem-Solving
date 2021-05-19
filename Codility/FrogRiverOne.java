/* Codility
 * Lesson 4 - FrogRiverOne
 * created on 2021.05.19
 * created by jionchu */

class Solution {
    public int solution(int X, int[] A) {
        
        //해당 위치에 잎이 떨어졌는지 확인하기 위한 boolean 배열
        boolean[] fall = new boolean[X];
        //몇 개의 위치에 잎이 떨어졌는지 나타내는 변수
        int count = 0;

        for (int i=0;i<A.length;i++) {
            //새로 잎이 떨어진 위치의 경우
            if (!fall[A[i]-1]) {
                //잎이 떨어졌음을 표시
                fall[A[i]-1] = true;
                //잎이 떨어진 위치 개수 증가
                count++;

                //모든 위치에 잎이 떨어진 경우
                //현재 time(i)을 return
                if (count == X) return i;
            }
        }

        //모든 위치에 잎이 떨어지지 않은 경우
        return -1;
    }
}