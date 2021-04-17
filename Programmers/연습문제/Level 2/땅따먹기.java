/* Programmers
 * 연습문제 - 땅따먹기
 * created on 2021.03.05
 * created by jionchu */

class Solution {
    int solution(int[][] land) {
        int[][] sum = new int[land.length][4];
        
        for (int i=0;i<4;i++) {
            sum[0][i] = land[0][i];
        }
        
        //마지막 행까지 차례대로 최대값 구하기
        for (int row=1;row<land.length;row++) {
            for (int col=0;col<4;col++)
                max(sum,land,row,col);
        }
        
        //마지막 행의 최대값 구하기
        int answer = 0;
        for (int i=0;i<4;i++) {
            if (answer < sum[land.length-1][i])
                answer = sum[land.length-1][i];
        }

        return answer;
    }
    
    private void max(int[][] sum, int[][] land, int row, int column) {
        int max = 0;
        //같은 열을 제외하고 가장 큰 수 구하기
        for (int i=0;i<4;i++) {
            if (column != i && sum[row-1][i] > max) {
                max = sum[row-1][i];
            }
        }
        //최대값 저장
        sum[row][column] = max + land[row][column];
    }
}