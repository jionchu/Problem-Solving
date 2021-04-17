/* Programmers
 * 연습문제 - 최대공약수와 최소공배수
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1,1};
        for (int i=1;i<=n;i++) {
            //최대공약수인지
            if (n % i == 0 && m % i == 0 && answer[0] < i)
                answer[0] = i;
        }
        //최소공배수
        answer[1] = n * m / answer[0];
        return answer;
    }
}