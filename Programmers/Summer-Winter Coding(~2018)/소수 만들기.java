/* Programmers
 * Summer/Winter Coding(~2018) - 소수 만들기
 * created on 2021.05.07
 * created by jionchu */

import java.util.HashSet;
class Solution {
    int answer = 0;
    int[] nums;
    public int solution(int[] nums) {
        this.nums = nums;
        
        nextNum(0,0,3);
        
        return answer;
    }
    
    //세 개의 수를 더하는 모든 경우 확인
    public void nextNum(int current, int index, int rest) {
        if (rest == 0) { //세 개의 수를 모두 더한 경우 소수인지 확인
            if (isPrime(current)) answer++;
        } else if (index + rest == nums.length) { //현재 수부터 마지막 수까지 다 더해야 하는 경우
            for (int i=0;i<rest;i++) {
                current += nums[index+i];
            }
            if (isPrime(current)) answer++;
        } else { //현재 수를 더하는 경우와 더하지 않는 경우로 분할
            nextNum(current+nums[index], index+1, rest-1); //더하는 경우
            nextNum(current, index+1, rest); //더하지 않는 경우
        }
    }
    
    //해당 숫자가 소수인지 확인
    public boolean isPrime(int num) {
        int i=2;
        while (i*i <= num) {
            //1이 아닌 다른 수로 나누어 떨어진다면 소수가 아님
            if (num % i++ == 0) return false;
        }
        return true;
    }
}