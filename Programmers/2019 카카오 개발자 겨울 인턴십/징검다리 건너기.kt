/* Programmers
 * 2019 카카오 개발자 겨울 인턴십 - 징검다리 건너기
 * created on 2021.07.31
 * created by jionchu */

class Solution {
    
    fun solution(stones: IntArray, k: Int): Int {
        var answer = 0
        
        var min = stones.min()!!
        var max = stones.max()!!
        
        // 이분탐색
        while (min <= max) {
            val mid = (min+max)/2
            
            if (isCrossingable(stones, mid, k)) {
                answer = mid
                min = mid+1
            }
            else {
                max = mid-1
            }
        }
        
        return answer
    }

    // num 명의 사람이 징검다리를 건널 수 있는지 확인
    fun isCrossingable(stones: IntArray, num: Int, limit: Int): Boolean {
        var i = limit-1
        var prev = 0

        while (i < stones.size) {

            prev = i-limit
            
            // 디딤돌을 건너지 못하는 경우
            while (stones[i] < num) {
                i--
                if (prev == i) return false
            }

            // 다음 디딤돌 확인하기
            i += limit
        }
        
        // 마지막 디딤돌까지 무사히 건넌 경우
        return true
    }
}