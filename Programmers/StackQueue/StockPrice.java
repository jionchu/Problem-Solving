/* Programmers
 * 스택/큐 - 주식가격
 * created on 2020.12.31
 * created by jionchu */

import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<Integer> index = new Stack<>();
        index.push(0);
        
        for (int i=1;i<prices.length-1;i++) {
            //가격이 떨어진 주식 스택에서 제거
            while(!index.isEmpty() && prices[index.peek()]>prices[i]) {
                int last = index.pop();
                answer[last] = i-last;
            }
            index.push(i);
        }
        
        answer[prices.length-1] = 0;
        //스택에 남아있는 index들의 가격이 떨어지지 않은 기간 계산
        while(!index.isEmpty()) {
            int i=index.pop();
            answer[i] = prices.length-i-1;
        }
        
        return answer;
    }
}