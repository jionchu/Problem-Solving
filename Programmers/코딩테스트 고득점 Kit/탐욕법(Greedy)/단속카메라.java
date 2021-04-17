/* Programmers
 * 탐욕법(Greedy) - 단속카메라
 * created on 2021.02.14
 * created by jionchu */

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return Integer.compare(o1[1], o2[1]);
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int camera = routes[0][1];
        for (int i=0;i<routes.length;i++) {
            int in = routes[i][0];
            int out = routes[i][1];

            if (camera < in) {
                camera = out;
                answer++;
            } else if (out < camera) {
                camera = out;
            }
        }

        return answer;
    }
}