/* Programmers
 * 연습문제 - 가장 큰 정사각형 찾기
 * created on 2021.04.05
 * created by jionchu */

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                //0인 경우 정사각형에 포함되지 않으므로 pass
                if (board[i][j] == 0) continue;
                
                //해당 칸이 어떤 정사각형에도 포함되지 않는 경우
                int size1 = 0;
                int size2 = 0;
                int size3 = 0;
                
                //범위 내의 좌표인 경우
                //해당 칸이 속한 가장 큰 정사각형의 한 변의 길이 가져오기
                if (i > 0) size1 = board[i-1][j];
                if (j > 0) size2 = board[i][j-1];
                if (i > 0 && j > 0) size3 = board[i-1][j-1];
                
                //현재 칸을 오른쪽 아래 꼭짓점으로 하는 2X2 정사각형에 저장된 값을 확인한다.
                //ex) (i-1,j-1), (i,j-1), (i-1,j) 세 칸에 저장된 값이 모두 3인 경우
                //현재 칸을 오른쪽 아래 꼭짓점으로 하는 4X4 정사각형이 만들어진다.
                board[i][j] = Math.min(Math.min(size1, size2), size3) + 1;
                
                //현재 최대값보다 큰 경우
                if (board[i][j] > answer)
                    answer = board[i][j];
            }
        }
        
        //넓이 계산하여 return
        return answer*answer;
    }
}