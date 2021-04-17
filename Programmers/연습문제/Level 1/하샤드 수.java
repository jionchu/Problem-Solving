/* Programmers
 * 연습문제 - 하샤드 수
 * created on 2021.01.24
 * created by jionchu */

class Solution {
    public boolean solution(int x) {
        int sum = 0, num = x;
        //각 자릿수의 합 구하기
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        if (x % sum == 0) //하샤드 수인 경우
            return true;
        else //하샤드 수가 아닌 경우
            return false;
    }
}