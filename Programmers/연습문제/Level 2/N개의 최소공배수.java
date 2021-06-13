/* Programmers
 * 연습문제 - N개의 최소공배수
 * created on 2021.06.13
 * created by jionchu */

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        for (int num : arr) {
            //현재 최소공배수와 num의 최소공약수 구하기
            int gcm = getGCM(answer, num);
            
            //현재 최소공배수와 num의 최소공배수 계산
            answer *= (num / gcm);
        }
        
        return answer;
    }
    
    //두 수의 최대공약수 구하기
    int getGCM(int num1, int num2) {
        int gcm = 1;
        int size = num1;
        if (num1 > num2) {
            size = num2;
        }
        
        //공약수인 경우 gcm 업데이트
        for (int i=2;i<=size;i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcm = i;
            }
        }
        
        return gcm;
    }
}