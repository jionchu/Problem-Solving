/* Programmers
 * 2020 KAKAO BLIND RECRUITMENT - 자물쇠와 열쇠
 * created on 2021.03.08
 * created by jionchu */

class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        for (int i=0;i<4;i++) { //키를 0도, 90도, 180도, 270도 회전하여 비교
            if (check(rotate(key,i),lock)) //맞는 키를 발견한 경우
                return true;
        }
        return false;
    }
    
    //시계 방향으로 회전시키기
    private int[][] rotate(int[][] key, int num) {
        int[][] newKey = new int[key.length][key.length];
        for (int i=0;i<key.length;i++) {
            for (int j=0;j<key.length;j++) {
                switch(num) {
                    case 0: return key;
                    case 1: newKey[i][j] = key[key.length-j-1][i]; break;
                    case 2: newKey[i][j] = key[key.length-i-1][key.length-j-1]; break;
                    case 3: newKey[i][j] = key[j][key.length-i-1]; break;
                }
            }
        }
        return newKey;
    }
    
    private boolean check(int[][] key, int[][] lock) {
        for (int i=-key.length+1;i<lock.length;i++) {
            for (int j=-key.length+1;j<lock.length;j++) {
                //i,j만큼 이동시킨 key와 lock 비교
                boolean flag = true;
                loop:
                for (int k=0;k<lock.length;k++) {
                    for (int m=0;m<lock.length;m++) {
                        if (k-i >= 0 && k-i<key.length && m-j >= 0 && m-j<key.length) { //키와 영역이 겹치는 경우
                            if (key[k-i][m-j] == lock[k][m]) {
                                //홈 부분을 채우지 못하거나
                                //돌기 부분끼리 만나는 경우
                                flag = false;
                                break loop;
                            }
                        } else if (lock[k][m]==0) { //키와 영역이 겹치지 않는 경우
                            flag = false; //홈이 있으면 실패
                            break loop;
                        }
                    }
                }
                if (flag) //맞는 키를 발견한 경우
                    return true;
            }
        }
        return false;
    }
}