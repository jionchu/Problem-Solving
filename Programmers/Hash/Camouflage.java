import java.util.HashMap;
import java.util.Iterator;

/* Programmers
 * 해시 - 위장
 * created on 2020.09.02
 * created by jionchu */

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // hashmap에 종류별 의상 갯수 입력
        HashMap<String, Integer> hm = new HashMap<>();
        for (String[] object : clothes) {
            hm.put(object[1], hm.getOrDefault(object[1], 0)+1);
        }
        
        // 각 종류별 선택 가능한 방법의 수를 곱한다.
        // 어떤 종류에 n개의 의상이 있다면 n+1 (입지 않는 경우까지)
        Iterator<Integer> it = hm.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        
        // 하루에 최소 한 개의 의상은 입어야 하므로
        // 어떤 종류의 의상도 입지 않는 경우를 제외한다.
        return answer-1;
    }
}
