/* Programmers
 * 2021 Dev-Matching: 웹 백엔드 개발자(상반기) - 행렬 테두리 회전하기
 * created on 2021.06.01
 * created by jionchu */

class Solution {
    private int[][] numbers;
    private int columns;
    private int min;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        numbers = new int[rows][columns];
        this.columns = columns;
        
        //각 쿼리마다 회전
        for (int i=0;i<queries.length;i++) {
            int row1 = queries[i][0]-1;
            int col1 = queries[i][1]-1;
            int row2 = queries[i][2]-1;
            int col2 = queries[i][3]-1;
            
            //첫 번째 좌표 값 설정
            if (numbers[row1][col1] == 0) {
                numbers[row1][col1] = row1 * columns + col1+1;
            }
            //첫 번째 좌표의 값 저장해두기
            int current = numbers[row1][col1];
            min = current;
            
            //위로 이동
            for (int j=row1;j<row2;j++) {
                move(j,col1,j+1,col1);
            }
            
            //왼쪽으로 이동
            for (int j=col1;j<col2;j++) {
                move(row2,j,row2,j+1);
            }
            
            //아래로 이동
            for (int j=row2;j>row1;j--) {
                move(j,col2,j-1,col2);
            }
            
            //오른쪽으로 이동
            for (int j=col2;j>col1;j--) {
                move(row1,j,row1,j-1);
            }
            
            //저장해 둔 첫 번째 좌표값
            //첫 번째 좌표의 한 칸 오른쪽 칸에 저장
            numbers[row1][col1+1] = current;
            
            //최소값 저장
            answer[i] = min;
        }
        
        return answer;
    }
    
    //현재 칸에 다음 칸의 값 옮겨오기
    public void move(int prevRow, int prevCol, int nextRow, int nextCol) {
        //초기화가 안 된 상태이면 값 설정
        if (numbers[nextRow][nextCol] == 0) {
            numbers[nextRow][nextCol] = nextRow * columns + nextCol + 1;
        }

        //다음 칸의 값 옮겨오기
        numbers[prevRow][prevCol] = numbers[nextRow][nextCol];
        
        //최소값인지 확인
        if (min > numbers[prevRow][prevCol]) {
            min = numbers[prevRow][prevCol];
        }
    }
}