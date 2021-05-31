/* Programmers
 * Summer/Winter Coding(~2018) - 방문 길이
 * created on 2021.05.31
 * created by jionchu */

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        boolean[][] column = new boolean[10][11]; //세로 길 방문 여부
        boolean[][] row = new boolean[11][10]; //가로 길 방문 여부
        
        int x = 5, y = 5; //초기 위치 (0,0)

        for (char c : dirs.toCharArray()) {
            switch (c) {
                //위로 이동하는 경우
                case 'U':
                    if (x > 0) {
                        x--;
                        
                        //처음 방문하는 경우
                        if (!column[x][y]) {
                            column[x][y] = true;
                            answer++;
                        }
                    }
                    break;
                //아래로 이동하는 경우
                case 'D':
                    if (x < 10) {
                        
                        //처음 방문하는 경우
                        if (!column[x][y]) {
                            column[x][y] = true;
                            answer++;
                        }
                        x++;
                    }
                    break;
                //오른쪽으로 이동하는 경우
                case 'R':
                    if (y < 10) {

                        //처음 방문하는 경우
                        if (!row[x][y]) {
                            row[x][y] = true;
                            answer++;
                        }
                        y++;
                    }
                    break;
                //왼쪽으로 이동하는 경우
                case 'L':
                    if (y > 0) {
                        y--;

                        //처음 방문하는 경우
                        if (!row[x][y]) {
                            row[x][y] = true;
                            answer++;
                        }
                    }
                    break;
            }
        }
        
        return answer;
    }
}