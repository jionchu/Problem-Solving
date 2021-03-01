/* Programmers
 * Summer/Winter Coding(~2018) - 기지국 설치
 * created on 2021.03.01
 * created by jionchu */

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int start=1,end=n;
        for (int station:stations) {
            //이전 기지국과 현재 기지국 사이에 기지국 설치
            end = station-w;
            answer += min(start,end,w);
            start = end+2*w+1;
        }
        //마지막 기지국 이후로 기지국 설치
        answer += min(start,n+1,w);
        return answer;
    }
    
    //구간 내에 설치해야 하는 기지국 최소 개수
    public int min(int start,int end,int w) {
        int count = 0;
        if (end-start>0) {
            count = (end-start+2*w)/(2*w+1);
        }
        return count;
    }
}