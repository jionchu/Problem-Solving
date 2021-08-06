/* Programmers
 * 위클리 챌린지 - 1주차 - 부족한 금액 계산하기
 * created on 2021.08.07
 * created by jionchu */

class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = 0;
        long nth_price = price;
        
        // 내야 하는 금액 계산
        for (int i=1;i<=count;i++) {
            sum += nth_price;
            nth_price += price;
        }
        
        // 부족한 금액 계산
        long answer = sum - money;
        
        // 부족하지 않은 경우 return 0
        if (answer <= 0) return 0;
        else return answer;
    }
}