/* LeetCode
 * #1 Two Sum
 * created on 2021.07.05
 * created by jionchu */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        // 배열 초기화
        val answer = IntArray(2,{0})
        // 각 숫자와 인덱스를 저장할 맵
        val map = mutableMapOf<Int,Int>()
        
        for (i in 0 until nums.size) {
            
            // 두 수의 합이 target과 동일한 경우
            if (map.containsKey(target-nums[i])) {
                answer[0] = map.get(target-nums[i])!!
                answer[1] = i
                break
            }
            
            // 맵에 현재 숫자와 인덱스 저장
            map.put(nums[i],i)
        }
        
        return answer;
    }
}