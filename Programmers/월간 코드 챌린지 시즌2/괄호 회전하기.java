/* Programmers
 * 월간 코드 챌린지 시즌2 - 괄호 회전하기
 * created on 2021.05.03
 * created by jionchu */

import java.util.Stack;
class Solution {
    char[] brackets;
    int count = 0;
    public int solution(String s) {
        int answer = 0;
        
        brackets = s.toCharArray();
        for (int i=0;i<brackets.length;i++) {
            //올바른 괄호 문자열일 때
            if (isValid(i)) {
                return count; //몇 개의 올바른 괄호 문자열로 이루어졌는지
            }
        }
        
        return answer;
    }
    
    //n번 회전한 문자열이 올바른 괄호 문자열인지 확인
    public boolean isValid(int num) {
        count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<brackets.length;i++) {
            char c = brackets[(i+num)%brackets.length];
            if (c=='[' || c=='(' || c=='{') {//여는 괄호의 경우
                stack.push(c);
            } else if (stack.size()>0) {//stack에 괄호가 있는 경우
                char prev = stack.peek();
                if ((c==']' && prev=='[') || (c==')' && prev=='(') || (c=='}' && prev=='{')) {
                    stack.pop();
                    if (stack.size() == 0) count++;
                } else {
                    return false;
                }
            } else {//닫는 괄호가 가장 먼저 나타나는 경우
                return false;
            }
        }
        
        return true;
    }
}