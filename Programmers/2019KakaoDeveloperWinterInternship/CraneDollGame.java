/* Programmers
 * 2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임
 * created on 2021.01.19
 * created by jionchu */

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        //각 칸의 가장 위에 있는 인형 위치 저장
        int[] top = new int[board.length];
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] != 0 && board.length-i > top[j])
                    top[j] = board.length-i;
            }
        }
        
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for (int i=0;i<moves.length;i++) {
            int column = moves[i]-1; //뽑을 칸
            //뽑을 인형이 있는 경우
            if (top[column]>0) {
                //인형 뽑기
                int doll = board[board.length-top[column]][column];
                if (!basket.isEmpty() && basket.peek() == doll) {
                    //같은 모양 인형 두개 없어짐
                    basket.pop();
                    answer+=2;
                } else {
                    basket.push(doll);
                }
                top[column]--;
            }
        }
        return answer;
    }
}