/* Programmers
 * 2019 KAKAO BLIND RECRUITMENT - 실패율
 * created on 2021.02.18
 * created by jionchu */

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] reach = new int[N]; //도달한 사용자 수
        int[] clear = new int[N]; //클리어한 사용자 수
        for (int stage : stages) {
            for (int i=0;i<stage-1;i++) {
                reach[i]++;
                clear[i]++;
            }
            if (stage<=N)
                reach[stage-1]++;
        }
        
        //실패율 계산
        float[][] failure = new float[N][2];
        for (int i=0;i<N;i++) {
            failure[i][0] = i+1;
            if (reach[i] == 0)
                failure[i][1] = 0;
            else
                failure[i][1] = (float)(reach[i]-clear[i])/reach[i];
        }
        
        //정렬
        Arrays.sort(failure, new Comparator<float[]>() {
            @Override
            public int compare(float[] o1, float[] o2) {
                if (o1[1] == o2[1])
                    return Float.compare(o1[0],o2[0]);
                return Float.compare(o2[1],o1[1]);
            }
        });
        
        //스테이지 번호만 저장
        for (int i=0;i<N;i++)
            answer[i] = (int)failure[i][0];
        
        return answer;
    }
}