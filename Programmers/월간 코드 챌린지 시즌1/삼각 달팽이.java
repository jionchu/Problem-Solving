/* Programmers
 * 월간 코드 챌린지 시즌1 - 삼각 달팽이
 * created on 2021.04.03
 * created by jionchu */

class Solution {
    private int[][] triangle;
    private int num = 1; //각 칸에 입력할 수
    public int[] solution(int n) {
        triangle = new int[n][n]; //삼각형 모양으로 수를 저장할 배열
        int row = 0,column = 0,limit = n;
        
        down(limit,row,column); //아래 방향으로 시작
        
        //정답 배열 크기 : num - 1
        //마지막 num 저장 후 num++ 했으므로 1을 빼준다.
        int[] answer = new int[num-1];
        int index = 0;
        //삼각형 모양의 배열에 반시계 방향으로 채워진 숫자들을
        //첫 행부터 순서대로 정답 배열에 저장한다.
        for (int i=0;i<n;i++) {
            for (int j=0;j<i+1;j++) {
                answer[index++] = triangle[i][j];
            }
        }
        
        return answer;
    }
    
    //limit = 1 인 경우
    //모든 칸을 다 채운 경우이므로 종료한다.

    //아래로 한 칸씩 이동
    public void down(int limit,int row,int column) {
        for (int i=0;i<limit;i++) {
            triangle[row++][column] = num++;
        }
        if (limit > 1) right(limit-1,row-1,column+1);
    }
    
    //오른쪽으로 한 칸씩 이동
    public void right(int limit,int row,int column) {
        for (int i=0;i<limit;i++) {
            triangle[row][column++] = num++;
        }
        if (limit > 1) up(limit-1,row-1,column-2);
    }

    //위로 한 칸씩 이동
    public void up(int limit,int row,int column) {
        for (int i=0;i<limit;i++) {
            triangle[row--][column--] = num++;
        }
        if (limit > 1) down(limit-1,row+2,column+1);
    }
}