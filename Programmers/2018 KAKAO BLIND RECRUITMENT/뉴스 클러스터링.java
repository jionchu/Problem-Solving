/* Programmers
 * 2018 KAKAO BLIND RECRUITMENT - [1차] 뉴스 클러스터링
 * created on 2021.05.27
 * created by jionchu */

import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        
        ArrayList<String> words1 = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();
        
        //집합 만들기
        setList(words1, str1);
        setList(words2, str2);
        
        //교집합
        int intersection = 0;
        for (int i=0;i<words1.size();i++) {
            if (words2.contains(words1.get(i))) {
                words2.remove(words1.get(i));
                intersection++;
            }
        }
        
        //합집합
        int union = words1.size() + words2.size();
        
        //유사도 구하기
        double similarity = 1;
        if (union != 0) similarity = (double) intersection / union;
        
        return (int) (similarity * 65536);
    }
    
    public void setList(ArrayList list, String str) {
        char prev = ' ';
        for (char c : str.toCharArray()) {
            //대문자인 경우 소문자로 변경
            if ('A' <= c && c <= 'Z') {
                c += 32;
            }
            //영문자로 된 글자 쌍인 경우
            if ('a' <= c && c <= 'z' && 'a' <= prev && prev <= 'z') {
                list.add(prev+""+c);
            }
            prev = c;
        }
    }
}