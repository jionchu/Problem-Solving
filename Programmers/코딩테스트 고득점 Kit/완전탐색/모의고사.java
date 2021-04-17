import java.util.ArrayList;

/* Programmers
 * 완전탐색 - 모의고사
 * created on 2020.09.20
 * created by jionchu */

class Solution {
    public int[] solution(int[] answers) {
        int score1=0, score2=0, score3=0;
        int[][] check = {{1,2,3,4,5},
                         {2,1,2,3,2,4,2,5},
                         {3,3,1,1,2,2,4,4,5,5}};
      
        for (int i=0;i<answers.length;i++) {
            //1번 수포자
            if (answers[i] == check[0][i%5]) score1++;
            //2번 수포자
            if (answers[i] == check[1][i%8]) score2++;
            //3번 수포자
            if (answers[i] == check[2][i%10]) score3++;
      }
      
      int maxScore = Math.max(score1, Math.max(score2, score3));
      
      ArrayList<Integer> list = new ArrayList<>();
      if(maxScore == score1) {list.add(1);}
      if(maxScore == score2) {list.add(2);}
      if(maxScore == score3) {list.add(3);}
      
      return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
