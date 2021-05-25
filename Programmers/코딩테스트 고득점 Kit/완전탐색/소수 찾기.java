/* Programmers
 * 완전탐색 - 소수 찾기
 * created on 2021.05.25
 * created by jionchu */

import java.util.HashSet;

class Solution {

    //소수인 숫자들 저장
    HashSet<Integer> set;
    //종이 조각들
    char[] nums;
    
    public int solution(String numbers) {
        set = new HashSet<>();
        nums = numbers.toCharArray();
        boolean[] used = new boolean[numbers.length()];
        
        makeNumber(0,used);
        
        return set.size();
    }
    
    //만들 수 있는 모든 숫자 조합하기
    public void makeNumber(int number, boolean[] used) {
        for (int i=0;i<nums.length;i++) {
            //조합에 사용되지 않은 숫자의 경우
            if (!used[i]) {
                used[i] = true; //사용
                //기존 숫자의 뒤에 붙이기
                int num = number*10+nums[i]-'0';
                checkPrime(num); //소수인지 확인
                makeNumber(num, used); //뒤에 이어서 숫자 만들기
                used[i] = false; //원래대로 돌리기
            }
        }
    }
    
    //입력 숫자가 소수인지 판별하는 함수
    public void checkPrime(int num) {
        if (num < 2) return;
        
        int i=2;
        while (i * i <= num) {
            //소수가 아닌 경우 종료
            if (num % i == 0) return;
            i++;
        }
        
        //소수인 경우 set에 추가
        set.add(num);
    }
}