/* Programmers
 * 연습문제 - 소수 찾기
 * created on 2020.02.04
 * created by jionchu */

 class Solution {
  public int solution(int n) {
      int answer = 0;
      
      for (int number=2;number<=n;number++) { // 1은 소수가 아니므로 제외
        boolean prime = true;
        for (int divide=2;divide<=Math.sqrt(number);divide++) { // 2부터 number의 제곱근까지 number를 나누는지 확인
          if (number%divide==0) {
            prime=false; // 소수가 아닌게 확인되면 break
            break;
          }
        }
        if (prime) answer++;
      }
      
      return answer;
  }
}
