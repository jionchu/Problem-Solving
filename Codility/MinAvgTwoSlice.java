/* Codility
 * Lesson 5 - MinAvgTwoSlice
 * created on 2021.06.04
 * created by jionchu */

class Solution {
    public int solution(int[] A) {
        int[] sum = new int[A.length+1];
        for (int i=0;i<A.length;i++) {
            sum[i+1] = sum[i] + A[i];
        }

        int answer = 0;
        float min = (float)(sum[2]-sum[0])/2;

        //slice 시작 index : i
        for (int i=0;i<A.length-2;i++) {
            //slice 끝 index : i+j
            for (int j=1;j<=2;j++) {
                float avg = (float)(sum[i+j+1]-sum[i])/(j+1);
                if (avg < min) {
                    min = avg;
                    answer = i;
                }
            }
        }

        //마지막 두 수의 평균
        if ((float)(sum[A.length]-sum[A.length-2])/2 < min) {
            answer = A.length-2;
        }
        
        return answer;
    }
}