/* Programmers
 * 월간 코드 챌린지 시즌2 - 110 옮기기
 * created on 2021.05.26
 * created by jionchu */

import java.util.Stack;
class Solution {
    public String[] solution(String[] s) {
        String[] answer = new String[s.length];
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb;
        
        for (int i=0;i<s.length;i++) {
            String str = s[i];
            sb = new StringBuilder();
            
            //존재하는 110의 개수
            int count = 0;
            char c1 = ' ';
            char c2 = ' ';
            
            for (char c : str.toCharArray()) {
                if (stack.size() >= 2) {
                    c2 = stack.pop();
                    c1 = stack.pop();
                    
                    //110이 나타나면
                    if (c1 == '1' && c2 == '1' && c == '0') {
                        count++;
                    } else {
                        stack.push(c1);
                        stack.push(c2);
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
                
            }
            
            //가장 앞에 있는 111 위치 찾기
            c1 = '1';
            c2 = '1';
            int index = 0;
            
            while (stack.size() > 0) {
                char c = stack.pop();
                //111이 나타나는 경우
                if (c == '1' && c1 == '1' && c2 == '1') {
                    index = -1;
                }
                
                sb.insert(0,c);
                index++;
                
                c1 = c;
                c2 = c1;
            }
            
            //모든 110을 최초의 111 앞에 모두 추가
            for (int j=0;j<count;j++) {
                sb.insert(index, "110");
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}