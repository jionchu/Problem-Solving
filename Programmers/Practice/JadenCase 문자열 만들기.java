/* Programmers
 * 연습문제 - JadenCase 문자열 만들기
 * created on 2021.04.06
 * created by jionchu */

class Solution {
    public String solution(String s) {
        boolean first = true; //단어의 첫 문자인지 확인
        char[] words = s.toCharArray();
        
        for (int i=0;i<words.length;i++) {
            //공백인 경우
            if (words[i] == ' ') {
                //이후에 오는 문자는 단어의 첫 문자이다.
                first = true;
                continue;
            }

            //첫 문자인 경우
            else if (first) {
                //이후에 오는 문자는 단어의 첫 문자가 아니다.
                first = false;
                
                //소문자인 경우 대문자로 변경
                if (words[i] >= 'a' && words[i] <= 'z')
                    words[i] = (char)(words[i] - 32);
            }

            //첫 문자가 아닌데 대문자인 경우
            //소문자로 변경
            else if (words[i] >= 'A' && words[i] <= 'Z'){
                words[i] = (char)(words[i] + 32);
            }
        }
        
        return new String(words);
    }
}