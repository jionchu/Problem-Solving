class Solution {
  public long solution(int w,int h){
    long answer = (long)w*h; // long으로 형변환 반드시 해줘야 함
    
    for (int i=1;i<=w;i++) { // 가로 1cm마다 사각형 좌우의 세로 좌표 계산
      answer-=(long)Math.ceil((double)i*h/w)-(long)Math.floor((double)(i-1)*h/w);
    }
    
    return answer;
  }
}
