/* Codility
 * Lesson 6 - Distinct
 * created on 2021.06.11
 * created by jionchu */

import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        
        //숫자들을 중복 없이 저장
        for (int num : A) {
            set.add(num);
        }
        
        //배열의 숫자들의 개수 return
        return set.size();
    }
}