/* Programmers
 * 연습문제 - 124 나라의 숫자
 * created on 2021.02.03
 * created by jionchu */

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            switch (n%3) { //나머지에 따라 숫자 붙이기
                case 0: sb.append("4"); break;
                case 1: sb.append("1"); break;
                case 2: sb.append("2"); break;
            }
            n=(n-1)/3; //다음 자릿수가 있는지 (0보다 큰지) 확인하기 위해
            //n이 3인 경우 n=0, 6인 경우 n=1이 된다.
        }
        return sb.reverse().toString();
    }
}