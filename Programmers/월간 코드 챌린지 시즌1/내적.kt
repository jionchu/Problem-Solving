/* Programmers
 * 월간 코드 챌린지 시즌1 - 내적
 * created on 2021.06.26
 * created by jionchu */

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        
        for (i in 0..a.size-1) {
            answer += (a[i]*b[i])
        }
        
        return answer
    }
}