/* Programmers
 * 2017 팁스타운 - 짝지어 제거하기
 * created on 2021.03.13
 * created by jionchu */

import java.util.Stack;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { //각 알파벳 확인
            if (stack.empty()) {
                stack.push(c);
            } else if (stack.peek() == c) { //이전 알파벳과 같은 경우 제거
                stack.pop();
            } else { //이외의 경우 스택에 추가
                stack.push(c);
            }
        }
        return stack.empty() ? 1 : 0;
    }
}