/* Programmers
 * 연습문제 - 피보나치 수
 * created on 2021.04.09
 * created by jionchu */

class Solution {
    public int solution(int n) {
        int[] numbers = new int[100001];
        
        numbers[0] = 0;
        numbers[1] = 1;
        
        for (int i=2;i<=n;i++) {
            numbers[i] = (numbers[i-2] + numbers[i-1])%1234567;
        }
        
        return numbers[n];
    }
}