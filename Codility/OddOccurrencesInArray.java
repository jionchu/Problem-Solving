/* Codility
 * Lesson 2 - OddOccurrencesInArray
 * created on 2021.04.13
 * created by jionchu */

import java.util.HashMap;
class Solution {
    public int solution(int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for (int num : A) {
            //pair의 첫 번째 수인 경우
            if (hm.getOrDefault(num, 0) == 0) {
                hm.put(num, 1);
            } else { //pair의 두 번째 수(pair 완성)인 경우
                hm.remove(num);
            }
        }

        int answer = 0;
        for (int num : hm.keySet()) { //hashmap에 key로 남아있는 수를 return
            answer = num;
        }
        return answer;
    }
}
