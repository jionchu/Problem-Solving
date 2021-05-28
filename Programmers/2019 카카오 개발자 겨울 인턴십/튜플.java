/* Programmers
 * 2019 카카오 개발자 겨울 인턴십 - 튜플
 * created on 2021.05.28
 * created by jionchu */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        ArrayList<String> tuples = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '{') {
                sb = new StringBuilder();
            } else if (c == '}') {
                tuples.add(sb.toString());
                i++;
            } else {
                sb.append(c);
            }
        }
        
        //길이순 정렬
        Collections.sort(tuples, new Comparator<String>() {
            @Override public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        
        int[] answer = new int[tuples.size()];
        HashSet<String> set = new HashSet<>();
        
        //첫번째 원소부터 차례대로 입력
        for (int i=0;i<tuples.size();i++) {
            String[] numbers = tuples.get(i).split(",");
            for (String num : numbers) {
                if (set.add(num)) {
                    answer[i] = Integer.parseInt(num);
                }
            }
        }
        
        return answer;
    }
}