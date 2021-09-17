/* Programmers
 * 월간 코드 챌린지 시즌3 - 없는 숫자 더하기
 * created on 2021.09.17
 * created by jionchu */

class Solution {
    fun solution(numbers: IntArray): Int {
        return 45 - numbers.fold(0) { acc, value -> acc + value}
    }
}