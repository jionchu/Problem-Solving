/* Programmers
 * 2020 KAKAO BLIND RECRUITMENT - 괄호 변환
 * created on 2021.02.05
 * created by jionchu */

class Solution {
    public String solution(String p) {
        return split(p);
    }
    
    public String split(String w) {
        //입력이 빈 문자열인 경우
        if (w.isEmpty())
            return "";
        
        int i, count = 0;
        boolean flag = true;
        
        for (i=0;i<w.length();i++) {
            if (w.charAt(i) == '(')
                count++;
            else
                count--;
            
            if (count < 0)
                flag = false;
            else if (count == 0)
                break;
        }
        
        String u = w.substring(0,i+1);
        String v = w.substring(i+1);
        
        if (flag) //u가 "올바른 괄호 문자열"인 경우
            return u+split(v);
        else //u가 "올바른 괄호 문자열"이 아닌 경우
            return "("+split(v)+")"+reverse(u.toCharArray());
    }
    
    public String reverse(char[] u) {
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<u.length-1;i++) { //앞뒤 문자를 제거하고 나머지 문자의 괄호 방향을 뒤집는다.
            if (u[i] == '(')
                sb.append(')');
            else
                sb.append('(');
        }
        return sb.toString();
    }
}