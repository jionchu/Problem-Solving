/* E-PPER 15회
 * Q9: N개의 작업공정
 * created on 2021.03.23
 * created by jionchu */

import java.util.Queue;
import java.util.LinkedList;
public class Q9 {
    public static void main(String[] args) {
        int[] N = {10, 20, 100, 20};
        int[][] Relation = {{1,2},{1,3},{2,4},{3,4}};
        int goal = 4;

        int solution = new Solution().solution(N, Relation, goal);
        System.out.println(solution);
        //130
    }

    public static class Solution {
        public int solution(int[] N, int[][] Relation, int goal) {
            int[] time = new int[N.length];
            boolean[][] adj = new boolean[N.length][N.length];
            int[] indegree = new int[N.length]; //선행 공정 개수

            for (int i=0;i<Relation.length;i++) {
                int u = Relation[i][0];
                int v = Relation[i][1];

                adj[u-1][v-1] = true; //u에서 v로 가는 엣지가 있음을 표시
                indegree[v-1]++; //v로 가기 위한 선행 공정 개수 추가
            }
            
            Queue<Integer> queue = new LinkedList<>();
            for (int i=0;i<indegree.length;i++) {
                if (indegree[i] == 0) { //선행단계가 없는 공정 추가
                    //선행단계가 없는 경우
                    //총 시간은 해당 공정에 소요되는 시간
                    time[i] = N[i];
                    queue.add(i);
                }
            }

            //인접한 모든 공정들의 소요시간 구하기
            while (!queue.isEmpty()) {
                int p = queue.poll(); //공정 번호
                for (int i=0;i<N.length;i++) {
                    //인접한(p가 선행공정인) 공정들
                    if (adj[p][i]) {
                        indegree[i]--; //선행 공정 빼기
                        //다른 선행공정들 소요시간보다 더 오래 걸리는 경우
                        if (time[i] < time[p] + N[i]) {
                            time[i] = time[p] + N[i];
                        }
                        
                        //모든 선행공정을 모두 완료한 경우
                        if (indegree[i] == 0) {
                            queue.add(i);
                        }
                    }
                }
            }

            //목표한 공정까지 소요되는 최소시간
            return time[goal-1];
        }
    }
}
