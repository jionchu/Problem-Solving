/* Programmers
 * 2021 KAKAO BLIND RECRUITMENT - 메뉴 리뉴얼
 * created on 2021.05.08
 * created by jionchu */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    
    char[] order;
    HashMap<String, Integer> hashMap;
    int max;

    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> arrayList = new ArrayList<>();

        //메뉴 개수별로 실행
        for (int count: course) {
            hashMap = new HashMap<>();
            max = 2; //최소 2명의 손님이 주문한 메뉴여야 함
            //각 손님이 주문한 단품 메뉴에서 코스요리 조합하기
            for (String order: orders) {
                char[] chars = order.toCharArray();
                Arrays.sort(chars);
                this.order = chars;
                setMenu("", 0, count);
            }
            
            //가장 많이 주문된 코스요리 리스트에 추가
            for (String key: hashMap.keySet()) {
                if (hashMap.get(key) == max) {
                    arrayList.add(key);
                }
            }
        }
        
        //결과 사전순 정렬
        String[] answer = arrayList.toArray(new String[arrayList.size()]);
        Arrays.sort(answer);
        return answer;
    }

    //메뉴 구성
    public void setMenu(String current, int index, int count) {
        if (count == 0) {
            //해당 코스요리 추가하기
            hashMap.put(current, hashMap.getOrDefault(current, 0)+1);
            //최댓값 업데이트
            if (hashMap.get(current) > max) max = hashMap.get(current);
        } else if (index + count <= order.length) {
            setMenu(current+order[index], index+1, count-1);
            setMenu(current, index+1, count);
        }
    }
}