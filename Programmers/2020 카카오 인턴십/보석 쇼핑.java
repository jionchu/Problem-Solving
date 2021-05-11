/* Programmers
 * 2020 카카오 인턴십 - 보석 쇼핑
 * created on 2021.05.11
 * created by jionchu */

import java.util.HashMap;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        int start = 1, end = 1;
        int min = 100000;
        
        //각 보석이 마지막으로 등장한 위치 저장
        HashMap<String, Integer> lastIndex = new HashMap<>();
        
        for (int i=0;i<gems.length;i++) {
            String gem = gems[i];

            //처음 등장하는 보석의 경우
            if (!lastIndex.containsKey(gem)) {
                end = i+1;
                lastIndex.put(gem, end);
                
                answer[0] = start;
                answer[1] = end;
                min = end-start;
            }

            //이미 등장한 보석의 경우
            else {
                end = i+1;
                int last = lastIndex.get(gem);
                lastIndex.put(gem, end);
                
                //현재 등장한 보석이 구간의 첫번째 보석이었던 경우
                //구간의 시작점 업데이트
                if (last == start)
                    start = getStartIndex(lastIndex);
                
                //구간이 더 짤은 경우
                if (min > end-start) {
                    //결과 업데이트
                    min = end-start;
                    answer[0] = start;
                    answer[1] = end;
                }
            }
        }
        
        return answer;
    }
    
    //존재하는 보석들 중 가장 먼저 등장한 보석의 위치 구하기
    public int getStartIndex(HashMap<String, Integer> hashmap) {
        int min = 100000;
        for (int index : hashmap.values()) {
            if (index < min) min = index;
        }
        return min;
    }
}