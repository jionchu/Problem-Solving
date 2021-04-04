/* Programmers
 * 2017 카카오코드 예선 - 카카오프렌즈 컬러링북
 * created on 2021.04.04
 * created by jionchu */

class Solution {
    private boolean[][] check;
    private int[][] picture;
    private int count,m,n;
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        check = new boolean[m][n];
        this.m = m;
        this.n = n;
        this.picture = picture;
        
        //모든 칸을 순서대로 확인
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                //다른 영역에 속하지 않은 색칠하는 영역
                if (!check[i][j] && picture[i][j] != 0) {
                    count = 0; //영역 넓이 초기화
                    numberOfArea++; //새로운 영역 시작
                    next(i,j,picture[i][j]); //현재 영역에 속하는지 확인
                    //현재 영역이 가장 큰 영역인 경우
                    if (count > maxSizeOfOneArea) {
                        maxSizeOfOneArea = count;
                    }
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    //현재 영역에 속하는지 확인하는 함수
    public void next(int i,int j,int color) {
        //그림 영역 밖의 좌표인 경우
        if (i < 0 | i >= m | j < 0 | j >= n)
            return;
        if (!check[i][j] & color == picture[i][j]) {
            check[i][j] = true; //확인했음을 표시
            count++; //현재 영역 넓이 증가
            //오른쪽
            next(i,j+1,color);
            //아래쪽
            next(i+1,j,color);
            //왼쪽
            next(i,j-1,color);
            //위쪽
            next(i-1,j,color);
        }
    }
}