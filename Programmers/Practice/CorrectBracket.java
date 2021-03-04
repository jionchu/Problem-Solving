/* Programmers
 * 연습문제 - 올바른 괄호
 * created on 2021.03.04
 * created by jionchu */

import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { //각 괄호를 체크
            if (c == '(') { //여는 괄호는 스택에 추가
                stack.push(c);
            } else if (stack.size() > 0) {
                stack.pop();
            } else {
                //괄호 쌍이 맞지 않는 경우
                return false;
            }
        }
        
        if (stack.size() > 0) return false;
        else return true;
    }
}