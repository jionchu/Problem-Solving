/* Programmers
 * 동적계획법(Dynamic Programming) - 정수 삼각형
 * created on 2021.02.22
 * created by jionchu */

class Solution {
    public int solution(int[][] triangle) {
        int[][] sum = new int[triangle.length][triangle.length];
        calculate(triangle, triangle.length-1, sum);
        return sum[0][0];
    }
    
    public void calculate(int[][] triangle, int row, int[][] sum) {
        if (row == triangle.length-1) { //가장 아래 줄
            for (int i=0;i<row+1;i++) {
                sum[row][i] = triangle[row][i];
            }
        } else {
            for (int i=0;i<row+1;i++) {
                sum[row][i] = max(sum[row+1][i],sum[row+1][i+1])+triangle[row][i];
            }
        }
        
        if (row > 0) //가장 윗줄이 아닌 경우
            calculate(triangle, row-1, sum);
    }
    
    public int max(int x, int y) { //최댓값 구하기
        if (x > y)
            return x;
        else
            return y;
    }
}