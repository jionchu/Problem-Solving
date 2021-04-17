/* Programmers
 * 깊이/너비 우선 탐색(DFS/BFS) - 네트워크
 * created on 2021.02.07
 * created by jionchu */

class Solution {
    int[][] computers;
    boolean[] check;
    int answer = 0;
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        check = new boolean[n]; //컴퓨터가 어떤 네트워크에 속해 있는지 나타내는 배열
        for (int i=0;i<check.length;i++) {
            if (!check[i]) {
                answer++; //새로운 네트워크 시작
                check[i] = true;
                dfs(i); //같은 네트워크에 속할 수 있는 컴퓨터가 있는지 확인
            }
        }
        return answer;
    }
    
    public void dfs(int index) {
        for (int i=0;i<check.length;i++) {
            if (index != i && computers[index][i] == 1) { //연결된 컴퓨터들 중
                if (!check[i]) { //다른 네트워크에 속하지 않은 컴퓨터
                    check[i] = true;
                    dfs(i); //같은 네트워크에 속할 수 있는 컴퓨터가 더 있는지 확인
                }
            }
        }
    }
}