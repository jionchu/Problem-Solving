/* Programmers
 * 월간 코드 챌린지 시즌2 - 2개 이하로 다른 비트
 * created on 2021.05.15
 * created by jionchu */

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i=0;i<numbers.length;i++) {
            long num = numbers[i];
            long zero = 1;
            long one = 0;
            
            while (num > 0) {
                //가장 오른쪽에 있는 0을 1로 바꿈
                //0의 오른쪽에 1이 있는 경우 가장 가까운 1을 0으로 바꿈
                if (num % 2 == 0) {
                    break;
                } else {
                    zero *= 2;
                    if (one == 0) one = 1;
                    else one *= 2;
                    num /= 2;
                }
            }
            
            answer[i] = numbers[i] + zero - one;
        }
        
        return answer;
    }
}