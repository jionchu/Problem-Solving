/* Programmers
 * 탐욕법(Greedy) - 조이스틱
 * created on 2021.06.28
 * created by jionchu */

import java.util.ArrayList;

class Solution {
    public int solution(String name) {
        
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i=0;i<name.length();i++) {
            char c = name.charAt(i);
            
            //조이스틱 조작해야 하는 문자 위치 저장
            if (c != 'A') {
                indexes.add(i);
            }
        }
        
        //조이스틱 조작 횟수 초기화
        int answer = 0;
        
        //현재 조이스틱 위치
        int current = 0;
        
        //모두 변경할 때까지 반복
        while (indexes.size() > 0) {
            
            //조이스틱을 오른쪽으로 옮기는 경우 이동 칸 수
            int right = indexes.get(0) - current;
            if (right < 0) right = name.length() - current + indexes.get(0);
            
            //조이스틱을 왼쪽으로 옮기는 경우 이동 칸 수
            int left = name.length() - indexes.get(indexes.size()-1) + current;
            if (left > name.length()) left = current - indexes.get(indexes.size()-1);
            
            //왼쪽으로 옮길지 오른쪽으로 옮길지 선택
            //오른쪽으로 옮기는 경우
            if (right <= left) {
                //조이스틱 이동
                answer += right;
                current = indexes.get(0);
                indexes.remove(0);
            }
            //왼쪽으로 옮기는 경우
            else {
                //조이스틱 이동
                answer += left;
                current = indexes.get(indexes.size()-1);
                indexes.remove(indexes.size()-1);
            }
            
            //문자 변경
            answer += setWord(name.charAt(current));
        }
        
        return answer;
    }
    
    private int setWord(char c) {
        int up = c-'A';
        int down = 'Z'-c+1;
        return up > down ? down : up;
    }
}