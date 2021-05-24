/* Programmers
 * Summer/Winter Coding(~2018) - 영어 끝말잇기
 * created on 2021.05.24
 * created by jionchu */

import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        //시작 알파벳
        char initial = words[0].charAt(0);
        //등장하는 단어들 set
        HashSet<String> set = new HashSet<>();
        
        for (int i=0;i<words.length;i++) {
            String word = words[i];
            //끝말잇기에 실패한 경우
            if (word.charAt(0) != initial || set.contains(word)) {
                answer[0] = i%n+1; //탈락자의 번호
                answer[1] = i/n+1; //탈락 차례
                break;
            }
            //끝말잇기에 성공한 경우
            else {
                //다음 단어가 이어야 하는 알파벳
                initial = word.charAt(word.length()-1);
                //등장한 단어 추가
                set.add(word);
            }
        }

        return answer;
    }
}