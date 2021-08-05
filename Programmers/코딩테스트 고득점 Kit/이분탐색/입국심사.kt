/* Programmers
 * 이분탐색 - 입국심사
 * created on 2021.08.05
 * created by jionchu */

class Solution {
    
    fun solution(n: Int, times: IntArray): Long {
        var answer: Long = 0
        
        var min: Long = n.toLong()/times.size*times.min()!!.toLong()
        var max: Long = times.max()!!.toLong() * n
        
        while (min <= max) {
            val mid: Long = (min+max)/2
            
            // 현재 시간 안에 n명의 사람을 모두 심사할 수 있는지
            var sum: Long = 0
            times.forEach {
                sum += mid/it
            }
            
            // 모두 심사 가능한 경우
            if (sum >= n) {
                // 정답 업데이트
                answer = mid

                // 더 짧은 시간으로 가능할 수 있음
                max = mid-1
            }
            
            // 모두 심사 가능하지 않은 경우
            else {
                // 더 많은 시간 필요
                min = mid+1
            }
        }
        
        return answer
    }
}