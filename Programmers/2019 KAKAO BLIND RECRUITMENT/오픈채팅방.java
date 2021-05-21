/* Programmers
 * 2019 KAKAO BLIND RECRUITMENT - 오픈채팅방
 * created on 2021.05.21
 * created by jionchu */

import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> name = new HashMap<>();
        
        String[] words;
        int count = 0;
        
        //id별 최종 이름 설정
        for (String line : record) {
            words = line.split(" ");
            if (words.length > 2) { //Enter, Change
                name.put(words[1], words[2]);
            }
            
            //최종 결과 개수 계산
            //이름 변경은 나타내지 않음
            if (!words[0].equals("Change")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int i = 0;
        for (String line : record) {
            words = line.split(" ");
            if (words[0].equals("Enter")) {
                answer[i++] = name.get(words[1])+"님이 들어왔습니다.";
            } else if (words[0].equals("Leave")) {
                answer[i++] = name.get(words[1])+"님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}