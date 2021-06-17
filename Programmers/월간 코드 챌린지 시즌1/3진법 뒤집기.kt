/* Programmers
 * 월간 코드 챌린지 시즌1 - 3진법 뒤집기
 * created on 2021.06.17
 * created by jionchu */

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num: Int = n
        
        while (num > 0) {
            //3진법 상에서 가장 낮은 자리수부터 10진법으로 변환
            answer = answer*3 + num%3
            num/=3
        }
        
        return answer
    }
}