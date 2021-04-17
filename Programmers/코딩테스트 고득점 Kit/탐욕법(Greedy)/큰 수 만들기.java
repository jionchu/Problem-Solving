/* Programmers
 * 탐욕법(Greedy) - 큰 수 만들기
 * created on 2021.01.31
 * created by jionchu */

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        
        int count = 0, i = 1;
        while(count < k && i < sb.length()) {
            //앞의 수가 현재 수보다 작은 경우 제거
            if (sb.charAt(i-1) < sb.charAt(i)) {
                sb.deleteCharAt(i-1);
                count++; //제거한 개수 증가
                i--; //제거한 수 이후의 수들의 index가 1씩 감소하므로

                //i-2번째 수와도 비교하기 위해
                if (i > 0)
                    i--;
            }
            i++; //다음 비교할 index
        }
        
        //k개를 제거하지 못한 경우 가장 하위 숫자들을 추가로 제거
        if (count < k) {
            sb.delete(sb.length()-k+count, sb.length());
        }
        return sb.toString();
    }
}