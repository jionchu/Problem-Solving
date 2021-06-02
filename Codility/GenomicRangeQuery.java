/* Codility
 * Lesson 5 - GenomicRangeQuery
 * created on 2021.06.02
 * created by jionchu */

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] answer = new int[P.length];
        int[][] genoms = new int[3][S.length()+1];
        
        //prefix sum 계산
        //현재 index까지 해당 genom이 몇 개 있는지 계산
        for (int i=0;i<S.length();i++) {
            char genom = S.charAt(i);
            int a = 0, c = 0, g = 0;

            if (genom == 'A') a = 1;
            else if (genom == 'C') c = 1;
            else if (genom == 'G') g = 1;

            //이전 index의 genom 개수에 현재 genom 개수 더하기
            genoms[0][i+1] = genoms[0][i] + a;
            genoms[1][i+1] = genoms[1][i] + c;
            genoms[2][i+1] = genoms[2][i] + g;
        }

        //해당 구간 사이의 최소 genom 구하기
        for(int i=0;i<P.length;i++) {
            int min = 4;
            
            //시작과 끝의 genom 개수가 1개 이상인 경우
            //해당 genom이 존재함
            if (genoms[0][Q[i]+1] - genoms[0][P[i]] > 0) min = 1;
            else if (genoms[1][Q[i]+1] - genoms[1][P[i]] > 0) min = 2;
            else if (genoms[2][Q[i]+1] - genoms[2][P[i]] > 0) min = 3;

            answer[i] = min;
        }

        return answer;
    }
}