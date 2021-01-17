/* Programmers
 * 연습문제 - 약수의 합
 * created on 2021.01.17
 * created by jionchu */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        //n의 제곱근까지 반복
        while (i <= Math.sqrt(n)) {
            //약수인 경우
            if (n % i == 0) {
                answer += i;
                //제곱근이 아닌 경우
                if (i != n/i)
                    answer += n/i;
            }
            i++;
        }
        return answer;
    }
}