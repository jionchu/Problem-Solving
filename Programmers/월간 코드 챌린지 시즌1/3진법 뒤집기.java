/* Programmers
 * 월간 코드 챌린지 시즌1 - 3진법 뒤집기
 * created on 2021.02.17
 * created by jionchu */

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) { //3진법 변환
            sb.append(n%3);
            n/=3;
        }
        return Integer.parseInt(sb.toString(),3); //10진법으로 변환
    }
}