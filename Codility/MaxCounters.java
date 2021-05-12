/* Codility
 * Lesson 4 - MaxCounters
 * created on 2021.05.12
 * created by jionchu */

class Solution {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        int max = 0;
        int maxCounter = 0;

        for (int i=0;i<A.length;i++) {
            int num = A[i];

            //maxCounter
            if (num > N) {
                if (i == 0 || i > 0 && A[i-1] <= N) {
                    maxCounter = max; //모든 수를 max 값으로 설정해야 함
                }
            } else {
                //maxCounter 값으로 설정되지 않은 경우
                if (answer[num-1] < maxCounter) {
                    answer[num-1] = maxCounter+1;
                } else { //maxCounter 값으로 설정되어 있는 경우
                    answer[num-1]++;
                }

                //max 값 업데이트
                if (answer[num-1] > max)
                    max = answer[num-1];
            }
        }

        //maxCounter 업데이트 안된 부분 업데이트
        for (int i=0;i<N;i++) {
            if (answer[i] < maxCounter) {
                answer[i] = maxCounter;
            }
        }

        return answer;
    }
}