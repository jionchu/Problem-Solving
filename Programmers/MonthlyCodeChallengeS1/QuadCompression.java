/* Programmers
 * 월간 코드 챌린지 시즌1 - 쿼드압축 후 개수 세기
 * created on 2021.03.02
 * created by jionchu */

class Solution {
    private int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        compress(arr,0,arr.length,0,arr.length);
        return answer;
    }
    
    public void compress(int[][] arr,int x1,int x2,int y1,int y2) {
        boolean flag = true;
        int num = arr[x1][y1]; //첫 번째 숫자
        for (int i=x1;i<x2;i++) {
            for (int j=y1;j<y2;j++) {
                if (arr[i][j] != num) { //다른 숫자가 있는 경우
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
        }
        if (flag) { //압축 가능한 경우
            answer[num]++;
        } else { //압축 불가능한 경우
            //부분 압축하기
            compress(arr,x1,x1+(x2-x1)/2,y1,y1+(y2-y1)/2);
            compress(arr,x1,x1+(x2-x1)/2,y1+(y2-y1)/2,y2);
            compress(arr,x1+(x2-x1)/2,x2,y1,y1+(y2-y1)/2);
            compress(arr,x1+(x2-x1)/2,x2,y1+(y2-y1)/2,y2);
        }
    }
}