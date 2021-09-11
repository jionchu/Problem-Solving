/* Programmers
 * 2021 KAKAO BLIND RECRUITMENT - 합승 택시 요금
 * created on 2021.09.11
 * created by jionchu */

class Solution {
    
    int[][] fareSum;
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        fareSum = new int[n][n];
        
        for (int i=0;i<fares.length;i++) {
            fareSum[fares[i][0]-1][fares[i][1]-1] = fares[i][2];
            fareSum[fares[i][1]-1][fares[i][0]-1] = fares[i][2];
        }
        
        // 각 지점들 사이의 최저요금 계산
        // Floyd-Warshal 알고리즘 사용
        // i를 거쳐 갈 때
        for (int i=0;i<n;i++) {
            // j부터 k까지 가는 최저요금 계산
            for (int j=0;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    nextSpot(i, j, k);
                }
            }
        }
        
        // 합승하지 않았을 때의 값을 초기값으로 설정
        int min = fareSum[s-1][s-1]+fareSum[s-1][a-1]+fareSum[s-1][b-1];
        
        for (int i=0;i<n;i++) {
            if ((fareSum[s-1][i] > 0 || i == s-1) && fareSum[s-1][i]+fareSum[i][a-1]+fareSum[i][b-1] < min) {
                min = fareSum[i][s-1]+fareSum[i][a-1]+fareSum[i][b-1];
            }
        }
        
        return min;
    }
    
    // fareSum[start][point] : start부터 point까지의 최저요금
    // fareSum[point][dest] : point부터 dest까지의 최저요금
    // fareSum[start][dest] : start부터 from까지의 최저요금
    private void nextSpot(int point, int start, int dest) {
        if ((fareSum[start][point] > 0 && fareSum[point][dest] > 0) && (fareSum[start][dest] == 0 || fareSum[start][dest] > fareSum[start][point]+fareSum[point][dest])) {
            fareSum[start][dest] = fareSum[start][point]+fareSum[point][dest];
            fareSum[dest][start] = fareSum[start][point]+fareSum[point][dest];
        }
    }
}